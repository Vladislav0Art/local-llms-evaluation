package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenAllExistingLines_whenGetThenReturnAllExistingLines {

    @Test
    public void givenAllExistingLines_whenGetThenReturnAllExistingLines() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("key1", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        assertEquals(2, comments.getAllComments().get("key1").size());
    }

}