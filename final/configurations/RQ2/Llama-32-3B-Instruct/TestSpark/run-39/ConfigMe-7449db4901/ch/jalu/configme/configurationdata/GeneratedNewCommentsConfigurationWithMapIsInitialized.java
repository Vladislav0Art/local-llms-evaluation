package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfigurationWithMapIsInitialized {

    @Test
    public void newCommentsConfigurationWithMapIsInitialized() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertNotNull(commentsConfig);
    }

}