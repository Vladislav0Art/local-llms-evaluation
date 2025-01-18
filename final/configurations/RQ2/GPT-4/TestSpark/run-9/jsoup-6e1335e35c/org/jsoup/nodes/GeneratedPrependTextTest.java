package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPrependTextTest {

    @Test
    public void prependTextTest() {
        Element elem = new Element("div");
        elem.prependText("hello");
        assertEquals("hello", elem.text());
    }

}