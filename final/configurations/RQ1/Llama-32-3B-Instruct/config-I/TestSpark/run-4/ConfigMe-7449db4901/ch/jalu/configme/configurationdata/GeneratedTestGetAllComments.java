package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetAllComments {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String commentLine1, String commentLine2) {
        comments.put(path, Arrays.asList(commentLine1, commentLine2));
    }

    public Map<String,@java.util.Map.Entry<String,
    @java.util.List<String>>>

    getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class GeneratedTest {
    private CommentsConfiguration commentsConfig = new CommentsConfiguration();

    @Test
    public void testGetAllComments() {
        String path1 = "path 1";
        String path2 = "path 2";
        Map<String, List<String>> map = new HashMap<>();
        map.put(path1, Arrays.asList("comment line 1", "comment line 2"));
        map.put(path2, Collections.singletonList("comment line 3"));
        commentsConfig.setComment(path1, "comment line 1", "comment line 2");
        commentsConfig.setComment(path2, "comment line 3");
        Map < String,@java.util.Map.Entry<String,@java.util.List<
        String >>> getAllComments = commentsConfig.getAllComments();
        assertEquals(map, getAllComments);
    }

}