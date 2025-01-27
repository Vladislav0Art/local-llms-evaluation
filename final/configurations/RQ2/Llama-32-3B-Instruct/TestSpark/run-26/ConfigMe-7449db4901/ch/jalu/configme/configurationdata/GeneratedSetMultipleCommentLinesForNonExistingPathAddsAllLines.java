package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetMultipleCommentLinesForNonExistingPathAddsAllLines {

    @Test
    public void setMultipleCommentLinesForNonExistingPathAddsAllLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> allComments = config.getAllComments();
        Set<String> paths = allComments.keySet();
        assertNotNull(paths);

        config.setComment("newPath", "commentLine1", "commentLine2");

        Map<String, List<String>> updatedAllComments = config.getAllComments();

        assertTrue(updatedAllComments.containsKey("newPath"));
    }

}