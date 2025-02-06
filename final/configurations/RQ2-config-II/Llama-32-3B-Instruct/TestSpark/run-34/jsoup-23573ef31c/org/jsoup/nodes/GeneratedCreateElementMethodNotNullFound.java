package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedCreateElementMethodNotNullFound {

    @Test
    public void createElementMethodNotNullFound() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = Document.createShell(connection.getUri());
        String tagName = "div";
        Element element = document.createElement(tagName);
        assertNotNull(element);
        assertEquals(tagName, element.getNodeName());
    }

}