package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("testId");
        assertEquals("testId", element.id());
    }

}