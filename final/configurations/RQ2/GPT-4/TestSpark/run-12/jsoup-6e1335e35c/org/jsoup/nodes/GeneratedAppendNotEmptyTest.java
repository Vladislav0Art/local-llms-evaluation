package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAppendNotEmptyTest {

    @Test
    public void appendNotEmptyTest() {
        Element element = new Element("div");
        element.append("<p>Test</p>");
        assertEquals("<p>Test</p>", element.html());
    }

}