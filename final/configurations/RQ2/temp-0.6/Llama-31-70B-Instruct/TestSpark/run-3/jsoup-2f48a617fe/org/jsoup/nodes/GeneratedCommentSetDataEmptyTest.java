package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCommentSetDataEmptyTest {

    @Test
    public void commentSetDataEmptyTest() {
        Comment comment = new Comment("This is a comment");
        comment.setData("");
        assertEquals("", comment.getData());
    }

}