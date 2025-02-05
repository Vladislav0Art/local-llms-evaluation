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

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("testPath", Arrays.asList("Old Line 1"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComment("testPath", "New Line 1", "New Line 2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Arrays.asList("New Line 1", "New Line 2"));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}