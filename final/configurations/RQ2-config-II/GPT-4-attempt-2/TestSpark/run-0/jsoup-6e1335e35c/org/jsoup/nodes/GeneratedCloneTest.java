package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element parent = new Element("div");
        parent.appendElement("p");
        Element clone = parent.clone();
        assertEquals(parent.tag(), clone.tag());
        assertEquals(parent.childNodeSize(), clone.childNodeSize());
    }

}