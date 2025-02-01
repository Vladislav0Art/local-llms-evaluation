package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationParameterizedConstructorTest() {
        Map<String, List<String>> inputMap = new HashMap<>();
        inputMap.put("inputPath", Arrays.asList("line1", "line2", "line3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputMap);
        Map<String, List<String>> outputMap = commentsConfiguration.getAllComments();

        assertEquals(inputMap.size(), outputMap.size());
        assertTrue(outputMap.containsKey("inputPath"));
        assertEquals(inputMap.get("inputPath"), outputMap.get("inputPath"));
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("newPath", "newLine1", "newLine2", "newLine3");

        Map<String, List<String>> outputMap = commentsConfiguration.getAllComments();
        assertEquals(1, outputMap.size());
        assertTrue(outputMap.containsKey("newPath"));
        assertEquals(Arrays.asList("newLine1", "newLine2", "newLine3"), outputMap.get("newPath"));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> inputMap = new HashMap<>();
        inputMap.put("getPath", Arrays.asList("get1", "get2", "get3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputMap);
        Map<String, List<String>> outputMap = commentsConfiguration.getAllComments();

        assertEquals(inputMap, outputMap);
    }

}