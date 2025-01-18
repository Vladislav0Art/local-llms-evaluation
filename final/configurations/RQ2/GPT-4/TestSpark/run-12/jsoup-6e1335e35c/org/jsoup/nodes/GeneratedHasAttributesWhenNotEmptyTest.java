package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedHasAttributesWhenNotEmptyTest {

    @Test
    public void hasAttributesWhenNotEmptyTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        assertTrue(element.hasAttributes());
    }

}