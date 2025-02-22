package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentWithNullPath {

    @Test
    public void setCommentWithNullPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment(null, new String[]{"comment 1", "comment 2"});
        assertEquals(0, comments.getAllComments().size());
    }

}