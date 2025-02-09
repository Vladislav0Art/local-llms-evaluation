package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element element = new Element("div");
        element.addClass("testClass");
        assertTrue(element.hasClass("testClass"));
    }

}