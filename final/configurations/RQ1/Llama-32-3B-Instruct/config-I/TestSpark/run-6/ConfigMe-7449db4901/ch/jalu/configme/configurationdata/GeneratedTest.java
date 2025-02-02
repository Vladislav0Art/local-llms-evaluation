package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertEquals(0, commentsConfig.comments.size());
    }

    @Test
    public void newCommentsConfigurationIsCopyOnConstruct() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("value"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertNotNull(commentsConfig.comments);
        assertEquals(0, commentsConfig.comments.size());
    }

    @Test
    public void setCommentSetsPathComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "comment");
        assertEquals(1, commentsMap.size());
        assertNotNull(commentsMap.get("path"));
        assertTrue((Boolean) commentsMap.get("path").contains("comment"));
    }

    @Test
    public void setCommentSetsPathCommentsWithNewLines() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "\n");
        assertEquals(1, commentsMap.size());
        assertNotNull(commentsMap.get("path"));
        assertTrue((Boolean) commentsMap.get("path").contains("\n"));
    }

    @Test
    public void setCommentSetsPathCommentsWithEmptyLine() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "\n\n");
        assertEquals(1, commentsMap.size());
        assertNotNull(commentsMap.get("path"));
        assertTrue((Boolean) commentsMap.get("path").contains("\n"));
    }

    @Test
    public void setCommentOverwritesExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "comment");
        commentsConfig.setComment("path", "new comment");
        assertEquals(1, commentsMap.size());
        assertNotNull(commentsMap.get("path"));
        assertTrue((Boolean) commentsMap.get("path").contains("new comment"));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "comment");
        Map<String, @UnmodifiableView List<String>> map = commentsConfig.getAllComments();
        assertTrue(map instanceof java.util.HashMap);
        assertEquals(1, ((java.util.HashMap) map).size());
        assertNotNull(((java.util.HashMap) map).get("path"));
        assertTrue((Boolean) ((java.util.HashMap) map).get("path").contains("comment"));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableList() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path", "comment");
        Map<String, @UnmodifiableView List<String>> map = commentsConfig.getAllComments();
        assertTrue(map instanceof java.util.HashMap);
        assertEquals(1, ((java.util.HashMap) map).size());
        assertNotNull(((java.util.HashMap) map).get("path"));
        assertTrue((Boolean) ((java.util.HashMap) map).get("path").contains("comment"));
    }

    @Test
    public void getAllCommentsHasNoNullKey() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> map = commentsConfig.getAllComments();
        assertTrue(map instanceof java.util.HashMap);
        assertFalse(map.containsKey(null));
    }

}