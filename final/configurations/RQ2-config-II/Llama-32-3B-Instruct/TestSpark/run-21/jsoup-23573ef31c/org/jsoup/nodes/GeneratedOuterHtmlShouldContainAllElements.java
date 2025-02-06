package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlShouldContainAllElements {

    @Test
    public void outerHtmlShouldContainAllElements() {
        Element head = Mockito.mock(Element.class);
        Element body = Mockito.mock(Element.class);
        Document document = new Document("http://example.com");
        document.head(head);
        document.body(body);

        String html = document.outerHtml();
        assertTrue(html.contains("<head>"));
        assertTrue(html.contains("</head>"));
        assertTrue(html.contains("<body>"));
        assertTrue(html.contains("</body>"));
    }

}