package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenEmptyComments_whenSet_thenNewEntryIsAdded {

    @Test
    public void givenEmptyComments_whenSet_thenNewEntryIsAdded() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("", "line");
        assertNotNull(comments.getComments().get(""));
        assertTrue(comments.getComments().get("").isEmpty());
    }

}