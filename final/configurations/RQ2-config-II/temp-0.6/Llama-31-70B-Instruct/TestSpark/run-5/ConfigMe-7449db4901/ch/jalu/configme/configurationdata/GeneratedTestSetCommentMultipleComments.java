package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSetCommentMultipleComments {

    @Test
    public void testSetCommentMultipleComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1", "comment2");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Arrays.asList("comment1", "comment2"), config.getAllComments().get("path1"));
    }

}