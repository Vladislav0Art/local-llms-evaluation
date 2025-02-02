package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import java.util.*;

public class GeneratedTestRemoveComment {

    @Test
    public void testRemoveComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        config.setComments(map);
        config.removeComment("path1");
        assertEquals(2, config.getComments().size());
    }

}