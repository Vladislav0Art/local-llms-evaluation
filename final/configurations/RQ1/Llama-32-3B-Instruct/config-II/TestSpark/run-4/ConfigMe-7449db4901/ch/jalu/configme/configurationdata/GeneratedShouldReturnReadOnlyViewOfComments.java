package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedShouldReturnReadOnlyViewOfComments {

    @Test
    public void shouldReturnReadOnlyViewOfComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        when(commentsConfig.comments).thenReturn(new HashMap<>());
        commentsConfig.setComment("path", commentLines);
        Map<String, @UnmodifiableView List<String>> readOnlyComments = commentsConfig.getAllComments();
        assertThat(readOnlyComments.get("path"), is(commentLines));
    }
}

}