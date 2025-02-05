package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("testPath1", Arrays.asList("Line 1"));
        commentsMap.put("testPath2", Arrays.asList("Line 1", "Line 2"));
        commentsMap.put("testPath3", Arrays.asList("Line 1", "Line 2", "Line 3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, commentsConfiguration.getAllComments());
    }

}