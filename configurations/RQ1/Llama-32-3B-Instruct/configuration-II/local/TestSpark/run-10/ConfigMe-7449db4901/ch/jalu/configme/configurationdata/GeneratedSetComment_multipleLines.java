package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSetComment_multipleLines {

    @Test
    public void setComment_multipleLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String comment1 = "This is a line with a comment";
        String comment2 = "";
        configuration.setComment("path1", comment1, comment2);
        assertEquals(2, configuration.getAllComments().get("path1").size());
        assertTrue(configuration.getAllComments().get("path1").contains(comment1));
        assertFalse(configuration.getAllComments().get("path1").isEmpty());
    }

}