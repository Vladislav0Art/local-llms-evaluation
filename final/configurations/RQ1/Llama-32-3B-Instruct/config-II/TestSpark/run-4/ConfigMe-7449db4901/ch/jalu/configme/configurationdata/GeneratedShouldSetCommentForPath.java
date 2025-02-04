package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedShouldSetCommentForPath {

    @Test
    public void shouldSetCommentForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        when(commentsConfig.comments).thenReturn(new HashMap<>());
        commentsConfig.setComment("path", commentLines);
        assertThat(commentsConfig.comments.get("path"), is(commentLines));
    }

}