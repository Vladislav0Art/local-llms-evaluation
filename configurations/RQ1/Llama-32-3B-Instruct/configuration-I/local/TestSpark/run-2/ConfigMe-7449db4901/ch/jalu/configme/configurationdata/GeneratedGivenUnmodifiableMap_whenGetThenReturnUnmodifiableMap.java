package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenUnmodifiableMap_whenGetThenReturnUnmodifiableMap {

    @Test
    public void givenUnmodifiableMap_whenGetThenReturnUnmodifiableMap() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("key1", Arrays.asList("line1"));
        CommentsConfiguration comments = new CommentsConfiguration(existingComments);
        Map<String, @UnmodifiableView List<String>> result = comments.getAllComments();
        assertTrue(result instanceof java.util.Map);
    }

}