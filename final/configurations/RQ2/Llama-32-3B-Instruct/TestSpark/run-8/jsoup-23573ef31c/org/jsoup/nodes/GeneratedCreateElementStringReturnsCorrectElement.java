package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateElementStringReturnsCorrectElement {

    @Test
    public void createElementStringReturnsCorrectElement() {
        String tagName = "div";
        Element element = new Element();
        Document document = new Document("http://example.com");
        Element result = document.createElement(tagName);
        assertNotNull(result);
        assertEquals(element, result);
    }

}