package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestGetAllElements {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetAllElements() {
        Element element = new Element("div");
        document.appendChild(element);
        assertEquals(2, document.getAllElements().size());
        assertNotNull(document.getAllElements().get(0));
        assertNotNull(document.getAllElements().get(1));
    }

    private Element elementFor(String text) {
        return new Element(tagName).text(text);
    }

}