package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateElementShouldReturnElement {

    @Test
    public void createElementShouldReturnElement() {
        Element element = Mockito.mock(Element.class);
        Document document = new Document("http://example.com");
        Element result = document.createElement("test");
        assertTrue(result instanceof Element);
        assertEquals(element, result);
    }

}