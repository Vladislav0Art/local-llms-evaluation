package ch.jalu.configme.configurationdata;

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
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("testPath1", Arrays.asList("Line1", "Line2"));
        initialComments.put("testPath2", Arrays.asList("Line3", "Line4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertEquals(2, comments.size());
        assertTrue(comments.containsKey("testPath1"));
        assertTrue(comments.containsKey("testPath2"));

        assertEquals("Line1", comments.get("testPath1").get(0));
        assertEquals("Line2", comments.get("testPath1").get(1));
        assertEquals("Line3", comments.get("testPath2").get(0));
        assertEquals("Line4", comments.get("testPath2").get(1));
    }

}