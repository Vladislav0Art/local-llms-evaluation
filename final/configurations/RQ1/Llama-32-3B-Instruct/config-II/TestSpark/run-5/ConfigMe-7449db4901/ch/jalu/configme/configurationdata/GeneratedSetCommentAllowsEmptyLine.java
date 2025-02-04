package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentAllowsEmptyLine {

    @Test
    public void setCommentAllowsEmptyLine() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String[] lines = {"line1", "", "line3"};
        configuration.setComment("path1", lines);
        assertNotNull(configuration.getComments());
        assertEquals(2, configuration.getComments().size());
        assertTrue(configuration.getComments().containsKey("path1"));
    }

}