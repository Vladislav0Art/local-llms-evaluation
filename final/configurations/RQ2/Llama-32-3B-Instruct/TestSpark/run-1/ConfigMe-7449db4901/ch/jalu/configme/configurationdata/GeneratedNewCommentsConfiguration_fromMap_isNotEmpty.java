package ch.jalu.configme.configurationdata;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedNewCommentsConfiguration_fromMap_isNotEmpty {

    public static List<String> asList(String... strings) {
        return Arrays.asList(strings);
    }

    @Test
    public void newCommentsConfiguration_fromMap_isNotEmpty() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", asList("comment1"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertFalse(configuration.getAllComments().isEmpty());
    }

}