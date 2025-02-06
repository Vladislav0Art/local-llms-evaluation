package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetAllComments_nonEmptyPath {

    @Test
    public void getAllComments_nonEmptyPath() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        String path = "path1";
        assertEquals(1, cfg.getAllComments().size());
        assertTrue(cfg.getAllComments().containsValue(Arrays.asList("line1", "line2")));
    }

}

class CommentConfigurationTestHelper {
    private Map<String, List<String>> commentLinesMap;

    public CommentConfigurationTestHelper(Map<String, List<String>> commentLinesMap) {
        this.commentLinesMap = commentLinesMap;
    }

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(commentLinesMap);
    }

}