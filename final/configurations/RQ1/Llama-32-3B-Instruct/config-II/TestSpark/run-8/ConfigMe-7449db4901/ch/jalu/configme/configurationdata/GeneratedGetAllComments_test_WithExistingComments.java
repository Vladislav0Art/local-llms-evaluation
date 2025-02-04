package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedGetAllComments_test_WithExistingComments {

    @Test
    public void getAllComments_test_WithExistingComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(config.getAllComments(), Collections.unmodifiableMap(commentsMap));
    }

}