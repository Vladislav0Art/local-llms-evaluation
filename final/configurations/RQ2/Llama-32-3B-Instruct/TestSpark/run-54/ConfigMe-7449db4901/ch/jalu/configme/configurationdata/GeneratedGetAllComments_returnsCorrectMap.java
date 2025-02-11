package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllComments_returnsCorrectMap {

    @Test
    public void getAllComments_returnsCorrectMap() {
        // Given:
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(existingComments);

        // When:
        Map < String,@org.jetbrains.annotations.UnmodifiableList<String >> comments = configuration.getAllComments();

        // Then:
        assertNotNull(comments);
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("path1"));
    }

}