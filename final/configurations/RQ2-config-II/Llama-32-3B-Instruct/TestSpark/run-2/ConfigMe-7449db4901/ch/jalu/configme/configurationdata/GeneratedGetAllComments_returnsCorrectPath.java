package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedGetAllComments_returnsCorrectPath {

    @Test
    public void getAllComments_returnsCorrectPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals("path1", config.getAllComments().keySet().iterator().next());
    }

}