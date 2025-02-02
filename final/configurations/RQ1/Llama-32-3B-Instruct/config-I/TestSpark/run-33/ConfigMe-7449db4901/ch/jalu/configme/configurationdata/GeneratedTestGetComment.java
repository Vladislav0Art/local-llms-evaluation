package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import java.util.*;

public class GeneratedTestGetComment {

    @Test
    public void testGetComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        config.setComments(map);
        assertEquals(Arrays.asList("line1"), config.getComments().get("path1"));
    }

}