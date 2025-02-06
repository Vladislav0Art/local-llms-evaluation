package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailReturnsEmptyStringWhenNoContent {

    @Test
    public void outerHtmlTailReturnsEmptyStringWhenNoContent() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        int depth = 0;
        TextNode textNode = new TextNode("");
        String html = textNode.outerHtmlTail(accum, depth, out);
        assertTrue(html.isEmpty());
    }

}