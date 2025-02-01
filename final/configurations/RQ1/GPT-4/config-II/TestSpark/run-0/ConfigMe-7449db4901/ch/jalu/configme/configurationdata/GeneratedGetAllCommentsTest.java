package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("Path1", new ArrayList<>(Arrays.asList("comment1", "comment2")));
        commentsMap.put("Path2", new ArrayList<>(Arrays.asList("comment1", "comment2", "comment3")));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsConfiguration.getAllComments(), commentsMap);
    }

}