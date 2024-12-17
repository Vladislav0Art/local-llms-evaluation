package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedGetAllCommentsUnmodifiable[]

Test {

    @Test
    public void getAllCommentsUnmodifiable[] Test() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("test1", Arrays.asList("line11", "line12"));
        config.setComment("test1", "line11", "line12");
        assertEquals(expectedComments, config.getAllComments());
    }

}