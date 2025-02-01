package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("newPath", "newLine1", "newLine2", "newLine3");

        Map<String, List<String>> outputMap = commentsConfiguration.getAllComments();
        assertEquals(1, outputMap.size());
        assertTrue(outputMap.containsKey("newPath"));
        assertEquals(Arrays.asList("newLine1", "newLine2", "newLine3"), outputMap.get("newPath"));
    }

}