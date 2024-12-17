package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    public class CommentsConfiguration {
        private Map<String, String> comments = new HashMap<>();

        public void setComment(String path, String comment) {
            comments.put(path, comment);
        }

        public Map<String, String> getComments() {
            return comments;
        }
    }

    @Test
    public void testGetComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1");
        config.setComment("path2", "comment2");

        Map<String, String> comments = config.getComments();
        assertEquals(2, comments.size());
        assertTrue(comments.containsKey("path1"));
        assertTrue(comments.containsKey("path2"));
    }

    @Test
    public void testSetComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1");
        config.setComment("path2", "comment2");

        Map<String, String> comments = config.getComments();
        assertEquals(2, comments.size());
        assertTrue(comments.containsKey("path1"));
        assertTrue(comments.containsKey("path2"));
    }

    @Test
    public void testGetCommentsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();

        Map<String, String> comments = config.getComments();
        assertTrue(comments.isEmpty());
    }

}