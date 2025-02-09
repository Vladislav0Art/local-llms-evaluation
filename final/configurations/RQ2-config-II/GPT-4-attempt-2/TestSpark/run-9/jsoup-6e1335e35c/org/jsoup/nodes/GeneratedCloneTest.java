package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        Element clone = element.clone();
        assertEquals(element, clone);
        assertNotSame(element, clone);
    }

}