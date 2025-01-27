package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCommentConfiguration_fromMap_isInitializedCorrectly {

    @Test
    public void commentConfiguration_fromMap_isInitializedCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(map);
        assertEquals(map, config.getAllComments());
    }

}