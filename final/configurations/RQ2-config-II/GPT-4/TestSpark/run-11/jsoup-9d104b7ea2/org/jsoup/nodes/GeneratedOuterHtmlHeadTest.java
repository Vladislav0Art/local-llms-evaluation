package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode node = new TextNode("test");
        Appendable accum = new StringBuffer();
        Document.OutputSettings out = new Document("").outputSettings();
        node.outerHtmlHead(accum, 0, out);
        assertEquals("test", accum.toString());
    }

}