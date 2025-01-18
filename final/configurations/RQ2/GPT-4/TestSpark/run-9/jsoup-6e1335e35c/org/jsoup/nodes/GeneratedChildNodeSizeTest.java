package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element elem = new Element("div");
        assertEquals(0, elem.childNodeSize());
        elem.appendElement("span");
        assertEquals(1, elem.childNodeSize());
    }

}