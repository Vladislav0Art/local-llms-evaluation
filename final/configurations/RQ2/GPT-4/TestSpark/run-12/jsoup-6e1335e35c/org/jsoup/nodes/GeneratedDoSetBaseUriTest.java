package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedDoSetBaseUriTest {

    @Test
    public void doSetBaseUriTest() {
        Element element = new Element("div");
        element.doSetBaseUri("http://example.com");
        assertEquals("http://example.com", element.baseUri());
    }

}