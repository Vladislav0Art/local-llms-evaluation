package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_emptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

    @Test
    public void newCommentsConfiguration_nonEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> line1 = new ArrayList<>();
        line1.add("line1");
        comments.put("path1", line1);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

    @Test
    public void newCommentsConfiguration_mapNotPassed() {
        CommentsConfiguration configuration = new CommentsConfiguration(null);
        assertNotNull(configuration.getAllComments());
    }
}

class CommentsConfiguration {

    private Map<String, List<String>> comments;

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public Map<String, List<String>> getAllComments() {
        return comments == null ? new HashMap<>() : comments;
    }

    public void setComment(String path, String[] commentLines) {
        // implementation
    }

}