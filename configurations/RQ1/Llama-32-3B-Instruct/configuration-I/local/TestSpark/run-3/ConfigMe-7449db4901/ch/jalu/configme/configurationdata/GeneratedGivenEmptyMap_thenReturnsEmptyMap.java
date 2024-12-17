package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenEmptyMap_thenReturnsEmptyMap {

    @Test
    public void givenEmptyMap_thenReturnsEmptyMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> map = comments.getAllComments();
        assertTrue(map.isEmpty());
    }

}