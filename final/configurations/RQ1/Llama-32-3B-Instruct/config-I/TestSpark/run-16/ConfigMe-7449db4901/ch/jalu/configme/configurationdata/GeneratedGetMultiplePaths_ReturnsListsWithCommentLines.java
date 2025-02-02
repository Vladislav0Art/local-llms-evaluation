package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetMultiplePaths_ReturnsListsWithCommentLines {

    @Test
    public void getMultiplePaths_ReturnsListsWithCommentLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "line1", "line2");
        config.setComment("/", "line3", "line4");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Arrays.asList("line1", "line2"), comments.get(""));
        assertEquals(Arrays.asList("line3", "line4"), comments.get("/"));
    }

}