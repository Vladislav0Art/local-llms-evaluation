package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_customMap {

    @Test
    public void newCommentsConfiguration_customMap() {
        Map<String, List<String>> customComments = new HashMap<>();
        customComments.put("key", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(customComments);
        assertEquals(customComments, config.comments);
    }

}