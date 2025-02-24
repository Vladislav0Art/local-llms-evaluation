package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCommentNullTest {

    @Test
    public void commentNullTest() {
        Comment comment = new Comment(null);
        assertEquals("", comment.getData());
    }

}