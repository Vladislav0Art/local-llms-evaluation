package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBeforeTest {

    @Test
    public void beforeTest() {
        Element element = new Element("tag");
        element.before("test");
        assertEquals("test", element.previousSibling().outerHtml());
    }

}