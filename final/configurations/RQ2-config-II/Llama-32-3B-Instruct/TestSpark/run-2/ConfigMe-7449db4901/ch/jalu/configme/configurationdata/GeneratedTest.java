package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

    @Test
    public void newCommentsConfiguration_fromMap_isPopulatedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        map.put("path2", Collections.singletonList(""));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals(2, config.getAllComments().size());
    }

    @Test
    public void setComment_overwritesExistingEntry() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("path1", "newComment");
        assertEquals(1, config.getAllComments().size());
    }

    @Test
    public void setComment_addsNewEntry() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "", "comment2");
        assertEquals(2, config.getAllComments().size());
    }

    @Test
    public void setComment_multipleLines_setsCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        Map<String, String> commentMap = new HashMap<>();
        commentMap.put("path1", "comment1");
        commentMap.put("path2", "");
        CommentsConfiguration config = new CommentsConfiguration(commentMap);
        config.setComment("path1", "", "comment2");
        assertEquals(2, config.getAllComments().size());
    }

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        Map<String, @UnmodifiableView List<String>> comments = config.getAllComments();
        assertTrue(comments.values().stream().allMatch(Objects::nonNull));
    }

    @Test
    public void getAllComments_returnsCorrectPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals("path1", config.getAllComments().keySet().iterator().next());
    }

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment(null, "comment"));
    }

}