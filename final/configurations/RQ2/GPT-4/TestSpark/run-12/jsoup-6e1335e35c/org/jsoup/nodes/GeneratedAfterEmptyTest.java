package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAfterEmptyTest {

    @Test
    public void afterEmptyTest() {
        Element element = new Element("div");
        element.after("");
        assertNull(element.nextSibling());
    }

}