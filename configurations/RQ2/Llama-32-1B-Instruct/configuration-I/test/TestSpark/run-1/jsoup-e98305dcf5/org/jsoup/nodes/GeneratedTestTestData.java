package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestTestData {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testTestData() {
        String data = "Hello World!";
        document.appendChild(elementFor(data));
        assertEquals(data, document.select("." + tagName).first().data());
    }

}