package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForNonExistingPathDoesNotAddNewEntry {

    @Test
    public void setCommentForNonExistingPathDoesNotAddNewEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> allComments = config.getAllComments();
        Set<String> paths = allComments.keySet();
        assertNotNull(paths);

        config.setComment("nonExistingPath", "commentLine");

        Map<String, List<String>> updatedAllComments = config.getAllComments();

        assertFalse(updatedAllComments.containsKey("nonExistingPath"));
    }

}