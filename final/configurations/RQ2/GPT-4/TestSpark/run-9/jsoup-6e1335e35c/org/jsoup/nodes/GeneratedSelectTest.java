package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element elem = new Element("div");
        elem.append("<span class='test'></span>");
        assertEquals("span", elem.select(".test").first().tagName());
    }

}