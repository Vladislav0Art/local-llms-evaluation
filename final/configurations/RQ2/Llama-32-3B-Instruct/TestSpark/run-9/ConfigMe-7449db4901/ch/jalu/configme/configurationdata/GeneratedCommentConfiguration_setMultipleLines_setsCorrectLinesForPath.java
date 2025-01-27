package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCommentConfiguration_setMultipleLines_setsCorrectLinesForPath {

    @Test
    public void commentConfiguration_setMultipleLines_setsCorrectLinesForPath() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("test", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments().get("test"));
    }

}