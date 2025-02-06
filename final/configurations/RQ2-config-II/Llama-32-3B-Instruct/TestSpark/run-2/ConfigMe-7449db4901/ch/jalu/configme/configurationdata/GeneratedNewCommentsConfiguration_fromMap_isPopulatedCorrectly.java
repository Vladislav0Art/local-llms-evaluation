package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_fromMap_isPopulatedCorrectly {

    @Test
    public void newCommentsConfiguration_fromMap_isPopulatedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        map.put("path2", Collections.singletonList(""));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals(2, config.getAllComments().size());
    }

}