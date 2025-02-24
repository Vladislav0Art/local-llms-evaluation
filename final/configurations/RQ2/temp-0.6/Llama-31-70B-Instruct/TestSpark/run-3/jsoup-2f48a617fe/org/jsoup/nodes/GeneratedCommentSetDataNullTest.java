package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCommentSetDataNullTest {

    @Test
    public void commentSetDataNullTest() {
        Comment comment = new Comment("This is a comment");
        comment.setData(null);
        assertEquals("", comment.getData());
    }

}