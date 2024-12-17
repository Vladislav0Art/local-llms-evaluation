package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetCommentsEmpty {

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
    public void testGetCommentsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();

        Map<String, String> comments = config.getComments();
        assertTrue(comments.isEmpty());
    }

}