package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSetComment_newComment {

    @Test
    public void setComment_newComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "This is a line with a comment");
        assertEquals(1, configuration.getAllComments().get("path1").size());
        assertTrue(configuration.getAllComments().get("path1").contains("This is a line with a comment"));
    }

}