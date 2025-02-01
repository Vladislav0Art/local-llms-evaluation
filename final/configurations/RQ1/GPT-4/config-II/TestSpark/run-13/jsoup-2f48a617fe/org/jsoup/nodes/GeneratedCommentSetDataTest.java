package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCommentSetDataTest {

    // Testing constructor and constructors related methods

    @Test
    public void CommentSetDataTest() {
        Comment comment = new Comment("test comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

}