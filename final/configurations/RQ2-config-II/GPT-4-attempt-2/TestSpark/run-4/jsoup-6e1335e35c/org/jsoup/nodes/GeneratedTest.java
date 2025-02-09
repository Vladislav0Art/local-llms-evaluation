package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void ElementTagBaseUriTest() {
        Element element = new Element(Tag.valueOf("p"), "www.example.com");
        assertEquals("p", element.tagName());
        assertEquals("www.example.com", element.baseUri());
    }

    @Test
    public void tagNameTest() {
        Element element = new Element("p");
        element.tagName("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void isBlockTest() {
        Element element = new Element("p");
        assertFalse(element.isBlock());
    }

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("test-id");
        assertEquals("test-id", element.id());
    }

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("attributeKey", "attributeValue");
        Element elementBoolean = new Element("div");
        elementBoolean.attr("attributeKey", true);
        assertEquals("attributeValue", element.attr("attributeKey"));
        assertEquals("true", elementBoolean.attr("attributeKey"));
    }

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertSame(1, element.childNodeSize());
    }

    @Test
    public void childrenSizeTest() {
        Element element = new Element("div");
        element.appendChild(new Element("p"));
        assertSame(1, element.childrenSize());
    }

    @Test
    public void childTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertSame(child, element.child(0));
    }

    @Test
    public void childNodesTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertSame(1, element.ensureChildNodes().size());
    }

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

    @Test
    public void appendTextTest() {
        Element element = new Element("div");
        element.appendText("example text");
        assertEquals("example text", element.text());
    }

    @Test
    public void dataTest() {
        Element element = new Element("div");
        element.append("data");
        assertEquals("data", element.data());
    }

}