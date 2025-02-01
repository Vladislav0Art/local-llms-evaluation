package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadAndTailTest {

    @Test
    public void outerHtmlHeadAndTailTest() throws IOException {
        TextNode textNode = new TextNode("  Test  ");
        Document.OutputSettings out = new Document.OutputSettings().prettyPrint(true);
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, out);
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("Test", accum.toString().trim());
    }

}