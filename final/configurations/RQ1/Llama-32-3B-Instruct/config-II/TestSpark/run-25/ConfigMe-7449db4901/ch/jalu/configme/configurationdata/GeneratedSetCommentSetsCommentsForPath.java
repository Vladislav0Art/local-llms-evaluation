package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsCommentsForPath {

    @Test
    public void setCommentSetsCommentsForPath() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        String path = "/path";
        String line1 = "line1";
        String line2 = "line2";
        cfg.setComment(path, line1, line2);
        assertTrue(cfg.comments.containsKey(path));
        assertEquals(Arrays.asList(line1, line2), cfg.comments.get(path));
    }

}