package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_nonEmptyMap_test {

    @Test
    public void getAllComments_nonEmptyMap_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("line11", "line12"));
        comments.put("key2", Arrays.asList("line21", "line22"));
        config.comments = Collections.unmodifiableMap(comments);
        assertNotNull(config.getAllComments());
    }

}