package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> inputMap = new HashMap<>();
        inputMap.put("getPath", Arrays.asList("get1", "get2", "get3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputMap);
        Map<String, List<String>> outputMap = commentsConfiguration.getAllComments();

        assertEquals(inputMap, outputMap);
    }

}