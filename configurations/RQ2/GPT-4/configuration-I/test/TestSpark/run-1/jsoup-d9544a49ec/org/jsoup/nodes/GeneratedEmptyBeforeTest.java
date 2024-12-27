package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEmptyBeforeTest {

    @Test
    public void emptyBeforeTest() {
        Element element = new Element("tag");
        element.text("test");
        element.empty();
        assertEquals("", element.text());
    }

}