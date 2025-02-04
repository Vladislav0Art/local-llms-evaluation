package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_fromMap_isInitializedCorrectly {

    @Test
    public void newCommentsConfiguration_fromMap_isInitializedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsValue(map.get("path")));
    }

}