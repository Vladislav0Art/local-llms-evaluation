package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadWithText {

    @Test
    public void outerHtmlHeadWithText() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 10, "Hello World!");
            assertEquals(11, accum.length());
            assertTrue(accum.toString().contains("<!--"));
            assertTrue(accum.toString().contains("Hello World!"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}