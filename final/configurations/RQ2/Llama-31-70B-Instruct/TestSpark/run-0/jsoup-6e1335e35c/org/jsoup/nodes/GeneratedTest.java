package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasChildNodes());

        element.appendChild(new Element(Tag.valueOf("p"), ""));
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasAttributes());

        element.attr("id", "test");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void testTagName() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals("div", element.tagName());

        element.tagName("p");
        assertEquals("p", element.tagName());
    }

    @Test
    public void testIsBlock() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertTrue(element.isBlock());

        element = new Element(Tag.valueOf("span"), "");
        assertFalse(element.isBlock());
    }

    @Test
    public void testId() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertNull(element.id());

        element.id("test");
        assertEquals("test", element.id());
    }

}