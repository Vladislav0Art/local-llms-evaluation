package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test comment");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--Test comment-->", accum.toString());
    }

}