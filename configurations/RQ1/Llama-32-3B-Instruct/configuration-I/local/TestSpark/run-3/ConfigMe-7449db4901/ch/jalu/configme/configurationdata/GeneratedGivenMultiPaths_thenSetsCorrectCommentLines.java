package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenMultiPaths_thenSetsCorrectCommentLines {

    @Test
    public void givenMultiPaths_thenSetsCorrectCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration cfg = new CommentsConfiguration(comments);
        cfg.setComment("path1", "comment1\ncomment2");
        cfg.setComment("path2", "comment3\ncomment4");
        Map<String, @UnmodifiableView List<String>> map = cfg.getAllComments();
        assertTrue(map.containsKey("path1"));
        assertEquals(Arrays.asList("comment1", "comment2"), map.get("path1"));
        assertTrue(map.containsKey("path2"));
        assertEquals(Arrays.asList("comment3", "comment4"), map.get("path2"));
    }

}