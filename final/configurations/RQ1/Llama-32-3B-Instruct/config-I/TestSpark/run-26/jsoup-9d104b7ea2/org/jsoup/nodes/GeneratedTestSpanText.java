package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestSpanText {

    @Test
    public void testSpanText() {
        Document doc = Document.parse("<html><body>Hello <span>World</span></body></html>");
        Element span = doc.body().select("span").first();
        assertEquals("#text", span.nodeName());
        assertEquals("World", span.text());
        assertTrue(span.isBlank());
    }

}