package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestGetElementsByAttributeValueMatching {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element element = new Element("a[href^=https://]");
        assertEquals(1, element.hasAttributes());
        assertTrue(document.select("a[href^=https://]").first().hasText(element.text()));
    }

}