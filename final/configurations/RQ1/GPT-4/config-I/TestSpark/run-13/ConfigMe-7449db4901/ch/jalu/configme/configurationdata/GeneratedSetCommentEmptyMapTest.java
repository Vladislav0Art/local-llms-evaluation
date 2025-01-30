package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentEmptyMapTest {

    @Test
    public void setCommentEmptyMapTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testPath", "Line1", "Line2");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("testPath"));
        assertEquals(2, comments.get("testPath").size());
        assertEquals("Line1", comments.get("testPath").get(0));
        assertEquals("Line2", comments.get("testPath").get(1));
    }

}