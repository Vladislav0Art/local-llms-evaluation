package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToString_ReturnsOuterHtml {

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        String text = "Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals(accum.toString(), textNode.toString());
    }

}