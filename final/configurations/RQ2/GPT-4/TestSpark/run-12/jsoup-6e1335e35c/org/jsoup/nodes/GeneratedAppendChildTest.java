package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertEquals(child, element.child(0));
    }

}