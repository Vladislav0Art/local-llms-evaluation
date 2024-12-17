package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenEmptyMap_whenGetThenReturnEmptyMap {

    @Test
    public void givenEmptyMap_whenGetThenReturnEmptyMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertTrue(comments.getAllComments().isEmpty());
    }

}