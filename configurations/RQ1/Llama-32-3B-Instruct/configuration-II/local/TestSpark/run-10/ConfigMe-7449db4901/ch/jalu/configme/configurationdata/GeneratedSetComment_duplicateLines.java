package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSetComment_duplicateLines {

    @Test
    public void setComment_duplicateLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String comment1 = "This is a line with a comment";
        String comment2 = "This is a line with a comment";
        configuration.setComment("path1", comment1, comment2);
        assertEquals(1, configuration.getAllComments().get("path1").size());
    }

}