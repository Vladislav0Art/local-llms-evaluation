package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorWithMap_commentsAreCopiedCorrectly {

    @Test
    public void constructorWithMap_commentsAreCopiedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        assertEquals(1, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey("path1"));
    }

}