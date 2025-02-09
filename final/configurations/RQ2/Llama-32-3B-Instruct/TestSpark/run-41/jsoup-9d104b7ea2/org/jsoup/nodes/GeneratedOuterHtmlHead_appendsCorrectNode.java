package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_appendsCorrectNode {

    @Test
    public void outerHtmlHead_appendsCorrectNode() throws IOException {
        StringBuilder expected = new StringBuilder("<p>Hello</p>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = null;
        TextNode node = new TextNode("Hello");
        node.outerHtmlHead(accum, 0, out);
        assertEquals(expected.toString(), accum.toString());
    }

}