package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSetComment_emptyLine {

    @Test
    public void setComment_emptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "\n");
        assertEquals(0, configuration.getAllComments().get("path1").size());
    }

}