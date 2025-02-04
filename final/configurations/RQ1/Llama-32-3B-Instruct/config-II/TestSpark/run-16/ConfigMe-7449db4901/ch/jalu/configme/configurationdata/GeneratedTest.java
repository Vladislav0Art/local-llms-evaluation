package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(0, configuration.getCommentCount());
    }

    @Test
    public void newCommentsConfigurationIsUnmodifiable() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        try {
            configuration.comments.put("test", null);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void newCommentsConfigurationCanBeSetWithOneLineComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "comment");
        assertEquals(1, configuration.getCommentCount());
    }

    @Test
    public void newCommentsConfigurationCanBeSetWithMultipleLinesComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "comment1", "comment2");
        assertEquals(2, configuration.getCommentCount());
    }

    @Test
    public void newCommentsConfigurationCanBeSetWithEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "\n");
        assertEquals(0, configuration.getCommentCount());
    }

    @Test
    public void setCommentUpdatesExistingEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("test", "comment1", "comment2");
        configuration.setComment("test", "newComment");
        assertEquals(1, configuration.getCommentCount());
    }

    @Test
    public void setCommentDoesNotChangeMapOrder() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String[] commentLines = {"comment1", "\n", "comment2"};
        configuration.setComment("test", commentLines);
        assertEquals(Arrays.asList("\n", "comment1", "comment2"), configuration.comments.get("test"));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = configuration.getAllComments();
        try {
            comments.put("test", null);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableList() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        List<String> commentLines = configuration.getAllComments().get("test");
        try {
            commentLines.remove(0);
            assert false;
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void setCommentWithNullPathThrowsNullPointerException() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> configuration.setComment(null, "comment"));
    }

    private int getCommentCount(CommentsConfiguration configuration) {
        return configuration.comments.size();
    }

}