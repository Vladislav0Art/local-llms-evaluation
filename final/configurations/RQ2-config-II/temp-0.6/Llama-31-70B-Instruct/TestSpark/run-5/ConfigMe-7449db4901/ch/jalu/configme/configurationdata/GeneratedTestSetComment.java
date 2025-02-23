package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("comment1"), config.getAllComments().get("path1"));
    }

}