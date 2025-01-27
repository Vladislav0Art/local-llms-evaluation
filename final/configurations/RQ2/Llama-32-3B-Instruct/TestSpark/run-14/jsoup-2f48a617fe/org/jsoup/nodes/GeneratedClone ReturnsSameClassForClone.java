package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedClone ReturnsSameClassForClone {

    @Test
    public void clone

    ReturnsSameClassForClone() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertSame(Comment.class, clonedComment.getClass());
    }

}