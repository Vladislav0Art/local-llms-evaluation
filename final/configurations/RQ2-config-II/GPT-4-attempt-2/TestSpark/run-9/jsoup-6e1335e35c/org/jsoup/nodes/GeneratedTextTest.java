package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element("p");
        element.appendText("test text");
        assertEquals("test text", element.text());
    }

}