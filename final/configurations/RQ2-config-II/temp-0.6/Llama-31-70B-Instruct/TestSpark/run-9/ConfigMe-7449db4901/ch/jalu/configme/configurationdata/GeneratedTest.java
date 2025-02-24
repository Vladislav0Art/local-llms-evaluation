package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCommentWithNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment(null, "comment"));
    }

    @Test
    public void setCommentWithNullCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> commentsConfiguration.setComment("path", (String[]) null));
    }

    @Test
    public void setCommentWithEmptyPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", "comment");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey(""));
        assertEquals(1, comments.get("").size());
        assertEquals("comment", comments.get("").get(0));
    }

    @Test
    public void setCommentWithEmptyCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("path"));
        assertEquals(1, comments.get("path").size());
        assertEquals("", comments.get("path").get(0));
    }

}