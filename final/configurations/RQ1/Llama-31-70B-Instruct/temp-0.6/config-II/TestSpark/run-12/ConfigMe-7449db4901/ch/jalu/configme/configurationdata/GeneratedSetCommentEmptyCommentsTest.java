package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentEmptyCommentsTest {

    @Test
    public void setCommentEmptyCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("hello");
        assertTrue(commentsConfiguration.getAllComments().containsKey("hello"));
        assertEquals(0, commentsConfiguration.getAllComments().get("hello").size());
    }

}