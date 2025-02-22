package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("hello", "world", "test");
        assertEquals(3, commentsConfiguration.getAllComments().get("hello").size());
        assertTrue(commentsConfiguration.getAllComments().get("hello").contains("world"));
        assertTrue(commentsConfiguration.getAllComments().get("hello").contains("test"));
    }

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "world", "test");
        assertEquals(2, commentsConfiguration.getAllComments().get(null).size());
        assertTrue(commentsConfiguration.getAllComments().get(null).contains("world"));
        assertTrue(commentsConfiguration.getAllComments().get(null).contains("test"));
    }

    @Test
    public void setCommentNullCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("hello", (String[]) null);
        assertTrue(commentsConfiguration.getAllComments().containsKey("hello"));
        assertEquals(0, commentsConfiguration.getAllComments().get("hello").size());
    }

    @Test
    public void setCommentEmptyCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("hello");
        assertTrue(commentsConfiguration.getAllComments().containsKey("hello"));
        assertEquals(0, commentsConfiguration.getAllComments().get("hello").size());
    }

}