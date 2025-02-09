package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document("").outputSettings());
        assertEquals("<!--data-->", accum.toString());
    }

}