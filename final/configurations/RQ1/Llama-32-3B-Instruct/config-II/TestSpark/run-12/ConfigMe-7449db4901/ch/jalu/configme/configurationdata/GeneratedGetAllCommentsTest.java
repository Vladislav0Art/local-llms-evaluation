package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("line7", "line8"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(commentMap, commentsConfiguration.getAllComments());
    }

}