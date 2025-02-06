package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_hasCommentLines {

    @Test
    public void newCommentsConfiguration_hasCommentLines() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration cfg = new CommentsConfiguration(commentLinesMap);
        assertEquals(1, cfg.getAllComments().size());
        assertTrue(cfg.getAllComments().containsValue(Arrays.asList("line1", "line2")));
    }

}