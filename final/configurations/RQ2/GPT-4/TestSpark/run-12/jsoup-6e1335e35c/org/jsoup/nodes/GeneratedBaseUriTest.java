package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        assertEquals("", element.baseUri());
    }

}