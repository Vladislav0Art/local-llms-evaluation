package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenUnmodifiableLines_whenSet_thenExistingLinesAreNotChanged {

    @Test
    public void givenUnmodifiableLines_whenSet_thenExistingLinesAreNotChanged() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("key1", Arrays.asList("line1"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        comments.setComment("newKey", Collections.singletonList("newLine"));
        assertEquals(2, comments.getComments().get("key1").size());
    }

}