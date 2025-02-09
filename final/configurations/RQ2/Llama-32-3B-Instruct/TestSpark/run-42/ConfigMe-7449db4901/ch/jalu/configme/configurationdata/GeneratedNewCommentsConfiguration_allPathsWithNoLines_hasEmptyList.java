package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_allPathsWithNoLines_hasEmptyList {

    @Test
    public void newCommentsConfiguration_allPathsWithNoLines_hasEmptyList() {
        CommentsConfiguration config = new CommentsConfiguration(Collections.singletonMap("path1", Collections.emptyList()));
        assertEquals(0, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}