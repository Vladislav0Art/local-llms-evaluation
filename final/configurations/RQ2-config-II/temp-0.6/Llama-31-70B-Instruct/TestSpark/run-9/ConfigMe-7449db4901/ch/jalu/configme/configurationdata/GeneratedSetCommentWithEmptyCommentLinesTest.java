package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentWithEmptyCommentLinesTest {

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