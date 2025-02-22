package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentNullPathTest {

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "world", "test");
        assertEquals(2, commentsConfiguration.getAllComments().get(null).size());
        assertTrue(commentsConfiguration.getAllComments().get(null).contains("world"));
        assertTrue(commentsConfiguration.getAllComments().get(null).contains("test"));
    }

}