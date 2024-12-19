package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestTag {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testTag() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
        assertEquals(null, element.text());
    }

}