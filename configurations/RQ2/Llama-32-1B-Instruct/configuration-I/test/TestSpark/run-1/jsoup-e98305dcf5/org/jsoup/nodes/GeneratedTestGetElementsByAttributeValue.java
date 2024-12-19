package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestGetElementsByAttributeValue {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element element = new Element("p");
        assertEquals(element, document.select("p[attr-length='6']").first());
    }

}