package ch.jalu.configme.configurationdata;

import java.util.Collections;
import java.util.Arrays;

public class GeneratedTestGetAllComments {

    private java.util.Map<String, String> map = new java.util.HashMap<>();

    public void add(String path, String line) {
        map.put(path, line);
    }

    public java.util.Set<String> getAllComments() {
        return map.keySet();
    }

    public String get(String path) {
        return map.get(path);
    }
}

public class CommentsTest {

    @Test
    public void testGetAllComments() {
        Comments comments = new Comments();
        assertTrue(comments.getAllComments().isEmpty());
    }

}