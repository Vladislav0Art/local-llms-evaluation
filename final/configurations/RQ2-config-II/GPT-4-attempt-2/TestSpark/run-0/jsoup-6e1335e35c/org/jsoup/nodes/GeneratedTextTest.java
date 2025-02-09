package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element("p").text("this is a test");
        assertEquals("this is a test", element.text());
    }

}