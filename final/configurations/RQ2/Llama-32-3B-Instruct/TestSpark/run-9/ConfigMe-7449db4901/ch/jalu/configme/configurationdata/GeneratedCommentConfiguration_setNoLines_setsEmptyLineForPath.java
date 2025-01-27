package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCommentConfiguration_setNoLines_setsEmptyLineForPath {

    @Test
    public void commentConfiguration_setNoLines_setsEmptyLineForPath() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(map);
        config.setComment("test", "");
        assertEquals(Collections.singletonList(""), config.getAllComments().get("test"));
    }

}