package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestHasData {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testHasData() {
        Element element = new Element("div");
        assertTrue(document.hasData(element));
    }

}