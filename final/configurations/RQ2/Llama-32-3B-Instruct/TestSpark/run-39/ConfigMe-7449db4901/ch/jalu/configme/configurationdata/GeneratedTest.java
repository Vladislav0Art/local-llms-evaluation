package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsInitialized() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertNotNull(commentsConfig);
    }

    @Test
    public void newCommentsConfigurationWithMapIsInitialized() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig);
    }

    @Test
    public void setCommentSetsLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        commentsConfig.setComment("path1", "line3");
        assertEquals(4, comments.size());
    }

    @Test
    public void setCommentWithEmptyLineResultingInNoCommentMarker() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("", "line2"));
        commentsConfig.setComment("path1", "");
        assertEquals(3, comments.size());
    }

    @Test
    public void getAllCommentsReturnsCorrectlyWhenNoCommentsSet() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(0, commentsConfig.getAllComments().size());
    }

    @Test
    public void setCommentSetsLinesForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        commentsConfig.setComment("path1", "line3");
        assertEquals(4, ((Map) commentsConfig.getAllComments()).size());
    }

    @Test
    public void setCommentWithEmptyLineResultingInNoCommentMarker() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("", "line2"));
        commentsConfig.setComment("path1", "");
        assertEquals(3, ((Map) commentsConfig.getAllComments()).size());
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        commentsConfig.setComment("path1", "line3");
        Object result = commentsConfig.getAllComments();
        assertTrue(result instanceof java.util.Map);
    }

}