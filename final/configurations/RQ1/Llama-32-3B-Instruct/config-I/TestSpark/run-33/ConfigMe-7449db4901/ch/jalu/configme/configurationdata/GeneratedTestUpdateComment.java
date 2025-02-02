package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import java.util.*;

public class GeneratedTestUpdateComment {

    @Test
    public void testUpdateComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        config.setComments(map);
        config.updateComment("path1", Arrays.asList("line2"));
        assertEquals(3, config.getComments().size());
    }

}