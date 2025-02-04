package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        assertThat(commentsConfig.getAllComments(), is(Collections.unmodifiableMap(commentsMap)));
    }

    @Test
    public void setComment_setsCommentLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String commentLine1 = "comment1\n";
        String commentLine2 = "comment2";
        commentsConfig.setComment(path, commentLine1, commentLine2);
        assertThat(commentsConfig.getAllComments().get(path), is(Arrays.asList(commentLine1, commentLine2)));
    }

    @Test
    public void setComment_setsEmptyLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String commentLine1 = "\n";
        String commentLine2 = "comment2\n";
        commentsConfig.setComment(path, commentLine1, commentLine2);
        assertThat(commentsConfig.getAllComments().get(path), is(Arrays.asList(commentLine1, commentLine2)));
    }

    @Test
    public void setComment_overridesExistingComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String existingCommentLine1 = "comment1\n";
        String commentLine2 = "comment2\n";
        commentsConfig.setComment(path, existingCommentLine1, commentLine2);
        assertThat(commentsConfig.getAllComments().get(path), is(Arrays.asList(commentLine2)));
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        assertThat(commentsConfig.getAllComments(), is(Collections.unmodifiableMap(commentsMap)));
    }

    @Test
    public void getAllComments_returnsCommentLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String commentLine1 = "comment1\n";
        String commentLine2 = "comment2\n";
        commentsConfig.setComment(path, commentLine1, commentLine2);
        assertThat(commentsConfig.getAllComments().get(path), is(Arrays.asList(commentLine1, commentLine2)));
    }

    @Test
    public void setCommentSetsNullPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String nullPath = null;
        try {
            commentsConfig.setComment(nullPath, "comment1\n", "comment2\n");
            assertThat(false, is(true));
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void setCommentSetsNullCommentLines() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        String nullCommentLine1 = null;
        String commentLine2 = "comment2\n";
        try {
            commentsConfig.setComment(path, nullCommentLine1, commentLine2);
            assertThat(false, is(true));
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void setCommentSetsNullComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = Mockito.mock(Map.class);
        commentsConfig.comments = commentsMap;
        String path = "test.path";
        null
        try {
            commentsConfig.setComment(path, null, null);
            assertThat(false, is(true));
        } catch (NullPointerException e) {
            // Expected
        }
    }

}