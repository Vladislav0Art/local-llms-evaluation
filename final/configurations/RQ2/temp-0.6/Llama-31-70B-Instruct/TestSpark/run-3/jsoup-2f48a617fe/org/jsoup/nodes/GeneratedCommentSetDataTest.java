package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCommentSetDataTest {

    @Test
    public void commentSetDataTest() {
        Comment comment = new Comment("This is a comment");
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

}