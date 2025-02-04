package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void constructor_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
    }

    @Test
    public void constructor_test_WithExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, config.comments);
    }

    @Test
    public void setComment_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1\ncomment2");
        assertNotNull(config.comments.get("path"));
        assertTrue(config.comments.containsKey("path"));
    }

    @Test
    public void setComment_test_WithNewEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1\ncomment2", "comment3");
        assertNotNull(config.comments.get("path"));
        assertEquals(2, ((List<String>) config.comments.get("path")).size());
        assertTrue(config.comments.containsKey("path"));
    }

    @Test
    public void setComment_test_EmptyEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertNotNull(config.comments.get("path"));
        assertEquals(0, ((List<String>) config.comments.get("path")).size());
        assertTrue(config.comments.containsKey("path"));
    }

    @Test
    public void setComment_test_NullPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> config.setComment(null, "comment1\ncomment2"));
    }

    @Test
    public void setComment_test_NullComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> config.setComment("path", null));
    }

    @Test
    public void getAllComments_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(config.getAllComments(), Collections.emptyMap());
    }

    @Test
    public void getAllComments_test_WithExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(config.getAllComments(), Collections.unmodifiableMap(commentsMap));
    }

    @Test
    public void getAllComments_test_NullMap() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(null).getAllComments());
    }

}