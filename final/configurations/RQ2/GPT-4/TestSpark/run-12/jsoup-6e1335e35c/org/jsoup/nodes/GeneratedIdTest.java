package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("test");
        assertEquals("test", element.id());
    }

}