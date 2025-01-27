package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForExistingPathUpdatesEntry {

    @Test
    public void setCommentForExistingPathUpdatesEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> allComments = config.getAllComments();
        Set<String> paths = allComments.keySet();
        assertNotNull(paths);

        config.setComment("path", "commentLine");
        config.setComment("path", "newCommentLine");

        Map<String, List<String>> updatedAllComments = config.getAllComments();

        assertTrue(updatedAllComments.containsKey("path"));
        assertEquals(1, updatedAllComments.get("path").size());
    }

}