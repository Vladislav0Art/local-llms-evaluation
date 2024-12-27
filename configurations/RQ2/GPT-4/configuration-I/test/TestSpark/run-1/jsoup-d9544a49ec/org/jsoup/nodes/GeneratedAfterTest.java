package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAfterTest {

    @Test
    public void afterTest() {
        Element element = new Element("tag");
        element.after("test");
        assertEquals("test", element.nextSibling().outerHtml());
    }

}