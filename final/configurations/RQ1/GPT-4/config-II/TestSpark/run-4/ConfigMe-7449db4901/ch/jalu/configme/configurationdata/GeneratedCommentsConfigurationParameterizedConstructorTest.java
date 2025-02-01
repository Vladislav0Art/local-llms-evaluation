package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationParameterizedConstructorTest {

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

}