package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentWithValidInput {

    @Test
    public void setCommentWithValidInput() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path", new String[]{"comment 1", "comment 2"});
        assertEquals(1, comments.getAllComments().size());
        assertEquals(2, comments.getAllComments().get("path").size());
        assertEquals("comment 1", comments.getAllComments().get("path").get(0));
        assertEquals("comment 2", comments.getAllComments().get("path").get(1));
    }

}