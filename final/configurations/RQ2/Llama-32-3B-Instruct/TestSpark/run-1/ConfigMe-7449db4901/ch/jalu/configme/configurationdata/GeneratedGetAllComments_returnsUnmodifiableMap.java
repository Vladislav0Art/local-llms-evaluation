package ch.jalu.configme.configurationdata;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedGetAllComments_returnsUnmodifiableMap {

    public static List<String> asList(String... strings) {
        return Arrays.asList(strings);
    }

    @Test
    public void getAllComments_returnsUnmodifiableMap() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertAll(
                () -> assertTrue(configuration.getAllComments().keySet().isEmpty()),
                () -> assertTrue(configuration.getAllComments().values().stream().allMatch(List::isEmpty))
        );
    }

}