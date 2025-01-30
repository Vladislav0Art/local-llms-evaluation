package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(0, commentsConfiguration.getAllComments().size());
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("test comment 1", "test comment 2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertTrue(commentsConfiguration.getAllComments().containsKey("path1"));
        assertTrue(commentsConfiguration.getAllComments().get("path1").contains("test comment 1"));
        assertTrue(commentsConfiguration.getAllComments().get("path1").contains("test comment 2"));
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path3", "test comment 3", "test comment 4");

        assertTrue(commentsConfiguration.getAllComments().containsKey("path3"));
        assertTrue(commentsConfiguration.getAllComments().get("path3").contains("test comment 3"));
        assertTrue(commentsConfiguration.getAllComments().get("path3").contains("test comment 4"));
    }

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