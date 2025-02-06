package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_canBeInitializedFromMap {

    @Test
    public void newCommentsConfiguration_canBeInitializedFromMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(1, ((HashMap) config.getAllComments()).size());
    }

}