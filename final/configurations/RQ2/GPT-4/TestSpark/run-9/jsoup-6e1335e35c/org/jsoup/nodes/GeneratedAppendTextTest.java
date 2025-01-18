package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendTextTest {

    @Test
    public void appendTextTest() {
        Element elem = new Element("div");
        elem.appendText("world");
        assertEquals("world", elem.text());
    }

}