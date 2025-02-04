package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentOverwritesExistingEntry {

    @Test
    public void setCommentOverwritesExistingEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "line1");
        configuration.setComment("path1", "newLine");
        assertNotNull(configuration.getComments());
        assertEquals(1, configuration.getComments().size());
        assertTrue(configuration.getComments().containsKey("path1"));
    }

}