package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_pathHasOneLine {

    @Test
    public void newCommentsConfiguration_pathHasOneLine() {
        CommentsConfiguration config = new CommentsConfiguration(Collections.singletonMap("path1", Arrays.asList("line1")));
        assertEquals(1, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

}