package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedGetAllComments_returnsCorrectPaths {

    @Test
    public void getAllComments_returnsCorrectPaths() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration comments = new CommentsConfiguration(map);
        assertTrue(comments.getAllComments().containsKey("path1"));
    }

}