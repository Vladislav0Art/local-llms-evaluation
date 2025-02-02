package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtml_WithTrimming {

    @Test
    public void outerHtml_WithTrimming() throws IOException {
        String text = "   Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Hello World!", accum.toString());
    }

}