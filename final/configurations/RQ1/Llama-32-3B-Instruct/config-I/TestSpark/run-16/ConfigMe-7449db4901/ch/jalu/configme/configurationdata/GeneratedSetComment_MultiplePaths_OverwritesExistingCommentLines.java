package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_MultiplePaths_OverwritesExistingCommentLines {

    @Test
    public void setComment_MultiplePaths_OverwritesExistingCommentLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "line1");
        config.setComment("", "line2");
        config.setComment("/", "line3", "line4");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Arrays.asList("line1", "line2"), comments.get(""));
        assertEquals(Arrays.asList("line3", "line4"), comments.get("/"));
    }

}