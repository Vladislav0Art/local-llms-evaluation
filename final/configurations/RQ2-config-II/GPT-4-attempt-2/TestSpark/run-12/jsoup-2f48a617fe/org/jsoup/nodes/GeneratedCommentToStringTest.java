package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCommentToStringTest {

    @Test
    public void CommentToStringTest() {
        Comment comment = new Comment("data");
        assertEquals("<!--data-->", comment.toString());
    }

}