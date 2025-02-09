package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationReturnsEmptyMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertThat(comments.getAllComments(), emptyMap());
    }

    @Test
    public void newCommentsConfigurationWithExistingDataReturnsCorrectData() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        assertThat(comments.getAllComments(), equalMapContainingEntry("path", Collections.singletonList("line1")));
    }

    @Test
    public void setCommentUpdatesAllComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        String[] commentLines = new String[]{"newLine", ""};
        comments.setComment("path", commentLines);
        assertThat(comments.getAllComments(), equalMapContainingEntry("path", Collections.singletonList("newLine")));
    }

    @Test
    public void setCommentDoesNotAddEmptyLines() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("line1", "", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        String[] commentLines = new String[]{"newLine"};
        comments.setComment("path", commentLines);
        assertThat(comments.getAllComments(), equalMapContainingEntry("path", Collections.singletonList("newLine")));
    }

    @Test
    public void setCommentWithNullPathIsInvalid() {
        Assertions.assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment(null, new String[0]));
    }
}

}