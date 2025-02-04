package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentMultiplePaths {

    @Test
    public void setCommentMultiplePaths() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String[] lines1 = {"line11"};
        String[] lines2 = {"line21"};
        configuration.setComment("path1", lines1);
        configuration.setComment("path2", lines2);
        assertNotNull(configuration.getComments());
        assertEquals(2, configuration.getComments().size());
    }

}