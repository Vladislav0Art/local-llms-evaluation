package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenEmptyPath_thenSetsCorrectCommentLines {

    @Test
    public void givenEmptyPath_thenSetsCorrectCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration cfg = new CommentsConfiguration(comments);
        cfg.setComment("", Arrays.asList("comment1\ncomment2"));
        Map<String, @UnmodifiableView List<String>> map = cfg.getAllComments();
        assertTrue(map.containsKey(""));
        assertEquals(Arrays.asList("comment1", "comment2"), map.get(""));
    }

}