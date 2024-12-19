package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsEmptyMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration.comments);
        assertEquals(0, configuration.comments.size());
    }

    @Test
    public void newCommentsConfigurationIsInitializedCorrectlyFromMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);
        assertNotNull(configuration.comments);
        assertEquals(1, configuration.comments.size());
        assertTrue(configuration.comments.containsKey("path1"));
    }

    @Test
    public void setCommentWorksAsExpectedForEmptyString() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("", "comment");
        assertNotNull(configuration.comments);
        assertEquals(0, configuration.comments.size());
    }

    @Test
    public void setCommentWorksAsExpectedForNoLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "\n");
        assertNotNull(configuration.comments);
        assertEquals(1, configuration.comments.size());
        assertTrue(configuration.comments.containsKey("path"));
        assertEquals(0, ((List<String>) configuration.comments.get("path")).size());
    }

    @Test
    public void setCommentWorksAsExpectedForLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment1\ncomment2");
        assertNotNull(configuration.comments);
        assertEquals(1, configuration.comments.size());
        assertTrue(configuration.comments.containsKey("path"));
        assertEquals(2, ((List<String>) configuration.comments.get("path")).size());
    }

    @Test
    public void getAllCommentsWorksAsExpected() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        configuration.comments = commentsMap;
        assertNotNull(configuration.getAllComments());
        assertEquals(1, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
        assertTrue(((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).containsKey("path1"));
    }

}