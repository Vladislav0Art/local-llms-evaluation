package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document("").outputSettings());
        assertEquals("", accum.toString());
    }

}