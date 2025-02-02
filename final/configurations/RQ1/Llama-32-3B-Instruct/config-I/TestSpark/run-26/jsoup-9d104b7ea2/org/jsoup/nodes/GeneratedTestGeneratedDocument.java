package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTestGeneratedDocument {

    @Test
    public void testGeneratedDocument() {
        Document doc = Document.parse("<html><body>Hello World</body></html>");
        assertEquals("#text", doc.body().nodeName());
        assertEquals("Hello World", doc.body().text());
        assertTrue(doc.body().isBlank());
    }

}