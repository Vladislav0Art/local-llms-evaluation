package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_fromMap_isNotEmpty {

    @Test
    public void newCommentsConfiguration_fromMap_isNotEmpty() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertEquals(1, commentsConfig.getAllComments().size());
        assertNotNull(commentsConfig.getAllComments().get("path1"));
    }

}