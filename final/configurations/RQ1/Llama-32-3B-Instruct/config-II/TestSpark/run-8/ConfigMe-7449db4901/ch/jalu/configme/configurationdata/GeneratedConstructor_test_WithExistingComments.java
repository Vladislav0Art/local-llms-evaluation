package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedConstructor_test_WithExistingComments {

    @Test
    public void constructor_test_WithExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, config.comments);
    }

}