package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        try {
            comment.outerHtmlHead(accum, 0, out);
        } catch (IOException ignored) {
        } // this exception can't be thrown by StringBuilder
        assertEquals("<!--Test-->", accum.toString());
    }

}