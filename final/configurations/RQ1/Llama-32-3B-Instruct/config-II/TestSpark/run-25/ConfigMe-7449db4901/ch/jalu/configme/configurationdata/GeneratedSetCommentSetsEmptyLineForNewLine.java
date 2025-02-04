package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsEmptyLineForNewLine {

    @Test
    public void setCommentSetsEmptyLineForNewLine() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        String path = "/path";
        cfg.setComment(path, "\n");
        assertTrue(cfg.comments.containsKey(path));
        assertEquals(Collections.singletonList(""), cfg.comments.get(path));
    }

}