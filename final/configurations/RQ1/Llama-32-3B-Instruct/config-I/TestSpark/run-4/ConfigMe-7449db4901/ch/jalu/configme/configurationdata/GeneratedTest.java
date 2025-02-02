package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String commentLine1, String commentLine2) {
        comments.put(path, Arrays.asList(commentLine1, commentLine2));
    }

    public Map<String, Map.Entry<String, List<String>>> getAllComments() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment line 1", "comment line 2"));
        map.put("path2", Collections.singletonList("comment line 3"));
        return Collections.unmodifiableMap(map);
    }
}

public class GeneratedTest {
    private CommentsConfiguration commentsConfig = new CommentsConfiguration();

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        String path1 = "path 1";
        String path2 = "path 2";
        map.put(path1, Arrays.asList("comment line 1", "comment line 2"));
        map.put(path2, Collections.singletonList("comment line 3"));
        comments.setComment(path1, "comment line 1", "comment line 2");
        comments.setComment(path2, "comment line 3");
        assertEquals(map, comments.getAllComments());
    }

    @Test
    public void getAllCommentsEmptyMapTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertNotNull(comments.getAllComments());
        assertTrue(comments.getAllComments().isEmpty());
    }

}