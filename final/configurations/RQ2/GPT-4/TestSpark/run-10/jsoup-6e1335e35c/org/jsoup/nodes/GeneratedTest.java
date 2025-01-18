package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void tagNameConstructorTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void tagConstructorTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals("div", element.tagName());
    }

    @Test
    public void hasChildNodesWithNoChildrenTest() {
        Element element = new Element("div");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void hasChildNodesWitChildrenTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertTrue(parent.hasChildNodes());
    }

    @Test
    public void hasAttributesWithNoAttributesTest() {
        Element element = new Element("div");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void hasAttributesWithAttributesTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void baseUriTest() {
        String baseUri = "http://localhost";
        Element element = new Element(Tag.valueOf("a"), baseUri);
        assertEquals(baseUri, element.baseUri());
    }

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        element.tagName("p");
        assertEquals("p", element.tagName());
    }

    @Test
    public void attrTest() {
        String key = "class";
        String value = "test";
        Element element = new Element("div");
        element.attr(key, value);
        assertTrue(element.hasAttributes());
        assertEquals(value, element.attr(key));
    }

    @Test
    public void childTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

    @Test
    public void childIndexOutOfBoundsTest() {
        Element parent = new Element("div");
        parent.child(0);
    }

    @Test
    public void childNodesSizeTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChildren(Arrays.asList(child1, child2));
        assertEquals(2, parent.childNodeSize());
    }

}