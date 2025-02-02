package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestGenerated {

    @Test
    public void testGenerated() {
        String input = "<span>Hello World!</span>";
        Document doc = Jsoup.parse(input);
        Element span = doc.selectFirst("span");
        TextNode textNode = span.children().first();
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals(11, textNode.coreValue().length());
    }

}