package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_appendsCorrectNode {

    @Test
    public void outerHtmlTail_appendsCorrectNode() throws IOException {
        StringBuilder expected = new StringBuilder("<p>Hello World</p>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNode("Hello World");
        node.outerHtmlTail(accum, 0, out);
        assertEquals(expected.toString(), accum.toString());
    }

}