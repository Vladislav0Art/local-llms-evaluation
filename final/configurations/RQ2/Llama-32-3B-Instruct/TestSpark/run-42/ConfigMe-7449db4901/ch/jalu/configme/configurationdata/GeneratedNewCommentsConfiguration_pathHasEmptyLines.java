package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_pathHasEmptyLines {

    @Test
    public void newCommentsConfiguration_pathHasEmptyLines() {
        CommentsConfiguration config = new CommentsConfiguration(Collections.singletonMap("path1", Arrays.asList("", "")));
        assertEquals(2, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

}