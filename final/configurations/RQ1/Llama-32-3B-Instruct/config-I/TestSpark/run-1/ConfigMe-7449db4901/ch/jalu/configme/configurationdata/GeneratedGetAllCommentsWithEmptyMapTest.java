package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsWithEmptyMapTest {

    @Test
    public void getAllCommentsWithEmptyMapTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfiguration.getComments());
    }
}

public class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public void setComments(String path, int lineStart, String marker, int lineEnd) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        List<String> lines = new ArrayList<>(Arrays.asList("", ""));
        lines.add(marker);
        comments.put(path, lines);
    }

}