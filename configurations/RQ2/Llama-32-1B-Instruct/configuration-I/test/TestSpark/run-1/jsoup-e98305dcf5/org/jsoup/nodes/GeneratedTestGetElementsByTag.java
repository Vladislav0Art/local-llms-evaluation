package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestGetElementsByTag {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetElementsByTag() {
        Elements elements = document.select("." + tagName);
        assertEquals(1, elements.size());
        assertNotNull(elements.get(0));
    }

}