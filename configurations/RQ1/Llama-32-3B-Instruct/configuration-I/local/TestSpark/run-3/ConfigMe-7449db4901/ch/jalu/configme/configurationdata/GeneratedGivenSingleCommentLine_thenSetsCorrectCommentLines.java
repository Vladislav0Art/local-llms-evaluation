package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenSingleCommentLine_thenSetsCorrectCommentLines {

    @Test
    public void givenSingleCommentLine_thenSetsCorrectCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration cfg = new CommentsConfiguration(comments);
        cfg.setComment("", "comment1\n");
        Map<String, @UnmodifiableView List<String>> map = cfg.getAllComments();
        assertTrue(map.containsKey(""));
        assertEquals(Arrays.asList("comment1"), map.get(""));
    }

}