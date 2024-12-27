package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateElement_tagTest {

    @Test
    public void createElement_tagTest() {
        Element element = new Element("test");
        assertEquals("test", element.tagName());
    }

}