package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestGetElementsByAttribute {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testGetElementsByAttribute() {
        Elements elements = document.select("a[href]");
        assertEquals(1, elements.size());
        assertNotNull(elements.get(0));
    }

}