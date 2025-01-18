package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedHasAttributesWhenEmptyTest {

    @Test
    public void hasAttributesWhenEmptyTest() {
        Element element = new Element("div");
        assertFalse(element.hasAttributes());
    }

}