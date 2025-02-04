package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isInitializedCorrectly() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(0, config.comments.size());
    }

    @Test
    public void newCommentsConfiguration_fromMap_isInitializedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsValue(map.get("path")));
    }

    @Test
    public void setComment_setsCommentsForPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment3");
        assertEquals(Collections.singletonList("comment3"), config.comments.get("path"));
    }

    @Test
    public void setComment_setsCommentsForPath_withNewLine_overwritesExisting() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "\n", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n", "newComment");
        assertEquals(Arrays.asList("newComment"), config.comments.get("path"));
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.unmodifiableMap(config.getAllComments()), config.comments);
    }

}