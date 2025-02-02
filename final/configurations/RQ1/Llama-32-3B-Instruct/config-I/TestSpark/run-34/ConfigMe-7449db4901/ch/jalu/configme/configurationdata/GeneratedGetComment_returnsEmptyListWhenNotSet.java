package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetComment_returnsEmptyListWhenNotSet {

    @Test
    public void getComment_returnsEmptyListWhenNotSet() {
        String path = "test-path";
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getComments());
        assertEquals(Collections.emptyList(), commentsConfiguration.getComments().get(path));
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public static CommentsConfiguration newInstance() {
        return new CommentsConfiguration();
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComment(String path, List<String> lines) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        comments.put(path, lines);
    }

    public List<String> getComment(String path) {
        return comments.get(path);
    }

}