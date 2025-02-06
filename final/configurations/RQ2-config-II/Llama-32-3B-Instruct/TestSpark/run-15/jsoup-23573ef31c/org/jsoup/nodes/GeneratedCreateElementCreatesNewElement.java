package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedCreateElementCreatesNewElement {

    @Test
    public void createElementCreatesNewElement() {
        Element parent = new org.jsoup.nodes.Element();
        Document document = Document.createShell("http://example.com");
        Element child = document.createElement("div");
        assertEquals(child, document.createElement("div"));
    }

}