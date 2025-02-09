package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetCommentUpdatesAllComments {

    @Test
    public void setCommentUpdatesAllComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        String[] commentLines = new String[]{"newLine", ""};
        comments.setComment("path", commentLines);
        assertThat(comments.getAllComments(), equalMapContainingEntry("path", Collections.singletonList("newLine")));
    }

}