package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_withMapIsInitializedWithGivenMap {

    @Test
    public void newCommentsConfiguration_withMapIsInitializedWithGivenMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);
        assertNotNull(commentsConfiguration.getComments());
        assertEquals(map, commentsConfiguration.getComments());
    }

}