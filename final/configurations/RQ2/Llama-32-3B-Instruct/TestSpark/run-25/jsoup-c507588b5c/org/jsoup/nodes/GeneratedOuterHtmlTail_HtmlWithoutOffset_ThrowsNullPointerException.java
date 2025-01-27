package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTail_HtmlWithoutOffset_ThrowsNullPointerException {

    @Test
    public void outerHtmlTail_HtmlWithoutOffset_ThrowsNullPointerException() {
        TextNode node = new TextNode("");
        Appendable accum = null;
        try {
            node.outerHtmlHead(accum, 1, null);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            assertTrue(e instanceof java.lang.NullPointerException);
        }
    }

}