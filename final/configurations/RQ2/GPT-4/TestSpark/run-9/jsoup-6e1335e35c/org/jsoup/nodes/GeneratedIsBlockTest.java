package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Element elemDiv = new Element("div");
        Element elemSpan = new Element("span");
        assertTrue(elemDiv.isBlock());
        assertFalse(elemSpan.isBlock());
    }

}