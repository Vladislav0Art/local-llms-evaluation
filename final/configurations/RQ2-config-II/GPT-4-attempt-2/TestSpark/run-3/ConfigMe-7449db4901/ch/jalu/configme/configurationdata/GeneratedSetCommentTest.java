package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("path", "Line 1", "Line 2", "Line 3");
        assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3"), commentsConfiguration.getAllComments().get("path"));

        commentsConfiguration.setComment("path", "Line 4");
        assertEquals(Arrays.asList("Line 4"), commentsConfiguration.getAllComments().get("path"));
    }

}