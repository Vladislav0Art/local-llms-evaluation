package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[
TextNode OuterHtmlHead]

Test {

    @Test
    public void [TextNode OuterHtmlHead]Test() throws IOException {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, depth, out);
        assertNotNull(accum.toString());
    }

}