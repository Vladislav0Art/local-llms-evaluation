package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCommentEmptyTest {

    @Test
    public void commentEmptyTest() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}