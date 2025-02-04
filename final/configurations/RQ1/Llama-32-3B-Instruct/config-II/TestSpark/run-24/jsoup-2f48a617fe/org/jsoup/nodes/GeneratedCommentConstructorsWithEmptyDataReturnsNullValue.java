package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCommentConstructorsWithEmptyDataReturnsNullValue {

    @Test
    public void CommentConstructorsWithEmptyDataReturnsNullValue() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}