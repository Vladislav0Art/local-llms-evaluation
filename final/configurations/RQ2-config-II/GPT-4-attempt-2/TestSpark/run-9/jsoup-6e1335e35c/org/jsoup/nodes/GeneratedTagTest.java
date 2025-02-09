package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedTagTest {

    @Test
    public void tagTest() {
        Element element = new Element("div");
        assertEquals(Tag.valueOf("div"), element.tag());
    }

}