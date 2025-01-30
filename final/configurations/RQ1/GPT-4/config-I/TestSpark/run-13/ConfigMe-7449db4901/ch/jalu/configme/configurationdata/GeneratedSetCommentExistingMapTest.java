package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentExistingMapTest {

    @Test
    public void setCommentExistingMapTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("testPath", Arrays.asList("OldLine1", "OldLine2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        commentsConfiguration.setComment("testPath", "NewLine1", "NewLine2");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("testPath"));
        assertEquals(2, comments.get("testPath").size());
        assertEquals("NewLine1", comments.get("testPath").get(0));
        assertEquals("NewLine2", comments.get("testPath").get(1));
    }

}