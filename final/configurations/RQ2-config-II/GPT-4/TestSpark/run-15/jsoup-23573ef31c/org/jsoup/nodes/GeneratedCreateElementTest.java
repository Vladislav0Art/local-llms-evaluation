package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("http://localhost");
        Element element = document.createElement("p");
        assertEquals("p", element.tagName());
    }

}