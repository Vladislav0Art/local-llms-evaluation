package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetNonEmptyPath_ReturnsListWithCommentLines {

    @Test
    public void getNonEmptyPath_ReturnsListWithCommentLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "line1", "line2");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(Arrays.asList("line1", "line2"), comments.get(""));
    }

}