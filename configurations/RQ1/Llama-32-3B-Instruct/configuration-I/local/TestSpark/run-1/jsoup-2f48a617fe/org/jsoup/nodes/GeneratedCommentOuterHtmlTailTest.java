package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCommentOuterHtmlTailTest {

    @Test
    public void CommentOuterHtmlTailTest() {
        Document.OutputSettings out = new Document.OutputSettings();
        java.io.ByteArrayOutputStream accum = new java.io.ByteArrayOutputStream();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}