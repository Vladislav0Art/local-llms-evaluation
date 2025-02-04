package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCloneMethodReturnsSameComment {

    @Test
    public void cloneMethodReturnsSameComment() {
        Comment comment = new Comment("Test");
        Comment clonedComment = comment.clone();
        assertTrue(comment == clonedComment);
    }

}