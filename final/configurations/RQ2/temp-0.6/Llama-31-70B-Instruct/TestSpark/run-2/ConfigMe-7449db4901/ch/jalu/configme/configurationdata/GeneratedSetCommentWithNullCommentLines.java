package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCommentWithNullCommentLines {

    @Test
    public void setCommentWithNullCommentLines() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path", null);
        assertEquals(0, comments.getAllComments().size());
    }

}