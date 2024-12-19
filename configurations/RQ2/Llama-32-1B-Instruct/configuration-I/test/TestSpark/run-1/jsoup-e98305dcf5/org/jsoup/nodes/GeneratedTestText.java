package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;

import static org.mockito.Mockito.mock;

public class GeneratedTestText {

    private Document document;

    public void setup() {
        document = new Document();
    }

    @Test
    public void testText() {
        String text = "Hello World!";
        document.appendChild(elementFor(text));
        assertEquals(text, document.select("." + tagName).first().text());
    }

}