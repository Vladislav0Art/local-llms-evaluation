package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        String tagName = "p";
        Element element = doc.createElement(tagName);
        assertNotNull(element);
        assertEquals(tagName, element.tagName());
    }

}