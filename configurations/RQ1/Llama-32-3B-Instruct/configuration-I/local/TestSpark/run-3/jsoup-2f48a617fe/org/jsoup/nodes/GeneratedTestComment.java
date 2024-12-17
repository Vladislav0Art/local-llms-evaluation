package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestComment {

    @Test
    public void testComment() {
        Comment comment = new Comment();
        comment.setData("Hello World!");
        assertEquals(comment.getData(), "Hello World!");
    }

}