package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void shouldCreateNewCommentsConfiguration() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertThat(commentsConfig.comments, is(new HashMap<>()));
    }

    @Test
    public void shouldNotSetCommentForNonExistentPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        when(commentsConfig.comments).thenReturn(new HashMap<>());
        commentsConfig.setComment("", commentLines);
        assertThat(commentsConfig.comments, is(Collections.emptyMap()));
    }

    @Test
    public void shouldSetCommentForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("comment1", "comment2");
        when(commentsConfig.comments).thenReturn(new HashMap<>());
        commentsConfig.setComment("path", commentLines);
        assertThat(commentsConfig.comments.get("path"), is(commentLines));
    }

    @Test
    public void shouldSetCommentForPathWithEmptyLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        List<String> commentLines = Arrays.asList("", "comment2");
        when(commentsConfig.comments).thenReturn(new HashMap<>());
        commentsConfig.setComment("path", commentLines);
        assertThat(commentsConfig.comments.get("path"), is(Collections.singletonList("").toString()));
    }

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