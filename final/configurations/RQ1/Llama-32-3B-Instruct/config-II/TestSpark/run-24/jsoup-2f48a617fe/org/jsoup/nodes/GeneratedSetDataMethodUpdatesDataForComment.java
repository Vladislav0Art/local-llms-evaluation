package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetDataMethodUpdatesDataForComment {

    @Test
    public void setDataMethodUpdatesDataForComment() {
        Comment comment = new Comment("Old");
        comment.setData("New");
        assertEquals("New", comment.getData());
    }

}