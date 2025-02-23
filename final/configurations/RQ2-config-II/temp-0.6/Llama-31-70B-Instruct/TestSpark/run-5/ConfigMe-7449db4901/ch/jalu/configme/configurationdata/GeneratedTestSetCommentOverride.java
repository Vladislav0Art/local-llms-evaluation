package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSetCommentOverride {

    @Test
    public void testSetCommentOverride() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1");
        config.setComment("path1", "comment2");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("comment2"), config.getAllComments().get("path1"));
    }

}