package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenNewPath_whenSet_thenNewEntryIsAdded {

    @Test
    public void givenNewPath_whenSet_thenNewEntryIsAdded() {
        CommentsConfiguration comments = new CommentsConfiguration();
        List<String> existingLines = new ArrayList<>(Arrays.asList("line1", "line2"));
        comments.setComment("newKey", existingLines.toArray(new String[0]));
        assertEquals(2, comments.getComments().get("newKey").size());
    }

}