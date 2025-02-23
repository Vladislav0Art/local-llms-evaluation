package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
        config.setComment("path1", "comment1");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("comment1"), config.getAllComments().get("path1"));
    }

}