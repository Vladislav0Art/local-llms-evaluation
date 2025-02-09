package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildrenTest {

    @Test
    public void childrenTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        child.id("test-id");
        element.appendChild(child);
        Elements children = element.children();
        assertEquals(1, children.size());
        assertEquals("test-id", children.first().id());
    }

}