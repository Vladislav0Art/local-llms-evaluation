package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedAppendEmptyTest {

    @Test
    public void appendEmptyTest() {
        Element element = new Element("div");
        element.append("");
        assertEquals("", element.html());
    }

}