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
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("testPath1", Arrays.asList("Line1.1", "Line1.2"));
        comments.put("testPath2", Arrays.asList("Line2.1", "Line2.2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(2, allComments.size());
        assertEquals("Line1.1", allComments.get("testPath1").get(0));
        assertEquals("Line1.2", allComments.get("testPath1").get(1));
        assertEquals("Line2.1", allComments.get("testPath2").get(0));
        assertEquals("Line2.2", allComments.get("testPath2").get(1));
    }

}