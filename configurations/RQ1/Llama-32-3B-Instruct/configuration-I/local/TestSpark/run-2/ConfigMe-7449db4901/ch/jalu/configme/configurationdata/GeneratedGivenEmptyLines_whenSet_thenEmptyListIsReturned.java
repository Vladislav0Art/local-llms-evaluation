package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenEmptyLines_whenSet_thenEmptyListIsReturned {

    @Test
    public void givenEmptyLines_whenSet_thenEmptyListIsReturned() {
        CommentsConfiguration comments = new CommentsConfiguration();
        List<String> existingLines = Collections.emptyList();
        comments.setComment("key1", existingLines.toArray(new String[0]));
        assertEquals(1, comments.getComments().get("key1").size());
    }

}