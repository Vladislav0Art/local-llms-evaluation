package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void setCommentWithNewPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey("path1"));
        assertEquals("comment1", allComments.get("path1").get(0));
        assertEquals("comment2", allComments.get("path1").get(1));
    }

    @Test
    public void setCommentWithExistingPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1");
        commentsConfiguration.setComment("path1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey("path1"));
        assertEquals("comment2", allComments.get("path1").get(0));
    }

    @Test
    public void getAllCommentsWithEmptyConfigurationTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.isEmpty());
    }

    @Test
    public void getAllCommentsWithExistingConfigurationTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Map.of("path1", List.of("comment1", "comment2")));
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey("path1"));
        assertEquals("comment1", allComments.get("path1").get(0));
        assertEquals("comment2", allComments.get("path1").get(1));
    }

    @Test
    public void CommentsConfigurationMapConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Map.of("path1", List.of("comment1", "comment2")));
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey("path1"));
        assertEquals("comment1", allComments.get("path1").get(0));
        assertEquals("comment2", allComments.get("path1").get(1));
    }

}