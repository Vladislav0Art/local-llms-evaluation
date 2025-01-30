package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> inputMap = new HashMap<>();
        inputMap.put("test-path1", Arrays.asList("comment1", "comment2"));
        inputMap.put("test-path2", Arrays.asList("comment3", "comment4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputMap);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(2, allComments.size());
        assertEquals(inputMap, allComments);
    }

}