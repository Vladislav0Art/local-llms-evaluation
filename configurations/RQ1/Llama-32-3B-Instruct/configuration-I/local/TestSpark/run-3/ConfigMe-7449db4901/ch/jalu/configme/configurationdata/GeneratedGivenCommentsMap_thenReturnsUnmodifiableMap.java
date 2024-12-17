package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenCommentsMap_thenReturnsUnmodifiableMap {

    @Test
    public void givenCommentsMap_thenReturnsUnmodifiableMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1"));
        CommentsConfiguration cfg = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> map = cfg.getAllComments();
        assertFalse(map.isEmpty());
        assertTrue(map.containsKey("path"));
    }

}