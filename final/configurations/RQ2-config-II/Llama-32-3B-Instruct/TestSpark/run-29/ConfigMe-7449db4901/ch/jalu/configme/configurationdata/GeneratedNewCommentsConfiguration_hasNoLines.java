package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_hasNoLines {

    @Test
    public void newCommentsConfiguration_hasNoLines() {
        CommentsConfiguration config = new CommentsConfiguration(new HashMap<>());
        Map<String, List<String>> comments = config.getAllComments();
        assertTrue(comments.isEmpty());
    }

}