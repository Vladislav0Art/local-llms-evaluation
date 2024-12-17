package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNode_OuterHtmlTail]

Test {

    @Test
    public void [TextNode_OuterHtmlTail]Test() throws IOException {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, depth, out);
        assertNotNull(accum.toString());
    }

}