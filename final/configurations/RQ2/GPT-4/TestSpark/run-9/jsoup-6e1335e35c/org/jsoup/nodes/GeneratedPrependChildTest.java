package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPrependChildTest {

    @Test
    public void prependChildTest() {
        Element elem = new Element("div");
        elem.prependChild(new Element("span"));
        assertEquals("span", elem.child(0).tagName());
    }

}