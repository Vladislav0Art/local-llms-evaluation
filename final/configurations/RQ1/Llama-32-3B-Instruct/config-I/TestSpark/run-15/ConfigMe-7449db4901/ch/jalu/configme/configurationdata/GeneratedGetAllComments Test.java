package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedGetAllComments Test {

    @Test
    public void getAllComments

    Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Arrays.asList("comment1"));
        expectedComments.put("anotherPath", Collections.singletonList("anotherComment"));
        assertEquals(expectedComments, configuration.getAllComments());
    }

}