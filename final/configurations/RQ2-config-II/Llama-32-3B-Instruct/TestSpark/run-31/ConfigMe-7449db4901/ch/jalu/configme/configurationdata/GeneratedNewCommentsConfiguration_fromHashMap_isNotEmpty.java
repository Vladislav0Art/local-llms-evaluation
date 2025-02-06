package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_fromHashMap_isNotEmpty {

    @Test
    public void newCommentsConfiguration_fromHashMap_isNotEmpty() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig.getAllComments());
        assertFalse(commentsConfig.getAllComments().isEmpty());
    }

}