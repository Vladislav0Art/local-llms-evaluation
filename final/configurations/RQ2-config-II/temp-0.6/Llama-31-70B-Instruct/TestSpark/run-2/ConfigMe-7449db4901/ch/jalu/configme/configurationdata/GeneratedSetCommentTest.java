package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment_line_1", "comment_line_2");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertTrue(comments.containsKey("path"));
        assertEquals(2, comments.get("path").size());
        assertEquals("comment_line_1", comments.get("path").get(0));
        assertEquals("comment_line_2", comments.get("path").get(1));
    }

}