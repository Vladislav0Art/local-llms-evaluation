package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("test");
        Appendable accum = new StringBuffer();
        Document.OutputSettings out = new Document("").outputSettings();
        node.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}