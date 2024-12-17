package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenNonEmptyCommentLines_thenSetsCorrectCommentLines {

    @Test
    public void givenNonEmptyCommentLines_thenSetsCorrectCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration cfg = new CommentsConfiguration(comments);
        cfg.setComment("path", "comment1\ncomment2");
        Map<String, @UnmodifiableView List<String>> map = cfg.getAllComments();
        assertTrue(map.containsKey("path"));
        assertEquals(Arrays.asList("comment1", "comment2"), map.get("path"));
    }

}