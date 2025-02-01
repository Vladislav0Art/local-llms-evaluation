package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings().prettyPrint(true));
        assertEquals("", sb.toString());
    }

}