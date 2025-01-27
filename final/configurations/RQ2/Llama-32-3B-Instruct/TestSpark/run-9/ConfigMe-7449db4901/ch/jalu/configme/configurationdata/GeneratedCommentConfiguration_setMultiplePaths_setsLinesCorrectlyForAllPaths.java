package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCommentConfiguration_setMultiplePaths_setsLinesCorrectlyForAllPaths {

    @Test
    public void commentConfiguration_setMultiplePaths_setsLinesCorrectlyForAllPaths() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test1", Arrays.asList("line11", "line12"));
        map.put("test2", Arrays.asList("line21", "line22"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("test1", "line11", "line12");
        config.setComment("test2", "");
        assertEquals(Collections.singletonMap(
                "test1", Arrays.asList("line11", "line12")
        ), config.getAllComments());
    }

}