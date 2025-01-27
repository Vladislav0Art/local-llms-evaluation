package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHead_HtmlWithOffset_ThrowsIOException {

    @Test
    public void outerHtmlHead_HtmlWithOffset_ThrowsIOException() {
        TextNode node = new TextNode("");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        try {
            node.outerHtmlHead(accum, 1, out);
            fail("Expected IOException");
        } catch (Exception e) {
            assertTrue(e instanceof java.io.IOException);
        }
    }

}