package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("hello", "world", "test");
        assertEquals(3, commentsConfiguration.getAllComments().get("hello").size());
        assertTrue(commentsConfiguration.getAllComments().get("hello").contains("world"));
        assertTrue(commentsConfiguration.getAllComments().get("hello").contains("test"));
    }

}