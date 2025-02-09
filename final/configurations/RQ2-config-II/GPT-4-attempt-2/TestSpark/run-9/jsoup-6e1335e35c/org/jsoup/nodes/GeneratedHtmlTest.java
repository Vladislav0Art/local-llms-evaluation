package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element("p");
        element.append("test html");
        assertEquals("test html", element.html());
    }

}