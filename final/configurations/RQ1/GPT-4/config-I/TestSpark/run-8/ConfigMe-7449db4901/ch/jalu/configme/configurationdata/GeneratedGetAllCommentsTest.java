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
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path2", Arrays.asList("comment 5", "comment 6"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey("path2"));
        assertTrue(allComments.get("path2").contains("comment 5"));
        assertTrue(allComments.get("path2").contains("comment 6"));
    }

}