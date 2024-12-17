package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenExistingPath_whenSet_thenExistingLinesAreUpdated {

    @Test
    public void givenExistingPath_whenSet_thenExistingLinesAreUpdated() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("key1", Arrays.asList("line1"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        comments.setComment("key1", "newLine");
        assertEquals(2, comments.getComments().get("key1").size());
    }

}