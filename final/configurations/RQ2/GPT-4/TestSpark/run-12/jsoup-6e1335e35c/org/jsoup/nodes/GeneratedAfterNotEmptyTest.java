package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAfterNotEmptyTest {

    @Test
    public void afterNotEmptyTest() {
        Element element = new Element("div");
        element.after("<p>Test</p>");
        assertNotNull(element.nextSibling());
    }

}