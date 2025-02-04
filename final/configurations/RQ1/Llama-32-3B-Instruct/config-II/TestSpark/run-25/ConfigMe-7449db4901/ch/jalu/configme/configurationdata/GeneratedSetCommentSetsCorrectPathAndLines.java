package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsCorrectPathAndLines {

    @Test
    public void setCommentSetsCorrectPathAndLines() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        String path = "/path";
        String[] lines = {"line1", "line2"};
        cfg.setComment(path, lines);
        assertTrue(cfg.comments.containsKey(path));
        assertEquals(lines, cfg.comments.get(path).toArray());
    }

}