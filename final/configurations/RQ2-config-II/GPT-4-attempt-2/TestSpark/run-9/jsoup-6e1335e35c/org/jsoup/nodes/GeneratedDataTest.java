package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Element element = new Element("div");
        element.attr("data-test-key", "testValue");
        assertEquals("testValue", element.dataset().get("testKey"));
    }

}