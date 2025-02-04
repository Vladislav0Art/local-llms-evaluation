package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsUnmodifiableMap {

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("/path", Arrays.asList("line1"));
        CommentsConfiguration cfg = new CommentsConfiguration(expected);
        assertTrue(cfg.getAllComments().equals(expected));
        assertFalse(cfg.getAllComments().containsKey("/other/path"));
    }

}