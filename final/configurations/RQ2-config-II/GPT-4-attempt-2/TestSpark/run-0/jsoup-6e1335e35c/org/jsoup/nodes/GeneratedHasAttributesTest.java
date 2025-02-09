package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasAttributesTest {

    @Test
    public void hasAttributesTest() {
        Element element = new Element("p");
        element.attr("class", "test");
        assertTrue(element.hasAttributes());
    }

}