package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void tagNameChangeTest() {
        Element element = new Element("p");
        element.tagName("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void isBlockTest() {
        Element blockElement = new Element("div");
        assertTrue(blockElement.isBlock());

        Element nonBlockElement = new Element("span");
        assertFalse(nonBlockElement.isBlock());
    }

    @Test
    public void idChangeTest() {
        Element element = new Element("p");
        element.id("main");
        assertEquals("main", element.id());
    }

    @Test
    public void dataTest() {
        Element element = new Element("data");
        assertEquals("", element.data());
    }

    @Test
    public void hasValidClassTest() {
        Element element = new Element("p");
        element.addClass("header");
        assertTrue(element.hasClass("header"));
    }

    @Test
    public void removeClassTest() {
        Element element = new Element("p");
        element.addClass("header");
        element.removeClass("header");
        assertFalse(element.hasClass("header"));
    }

    @Test
    public void toggleClassTest() {
        Element element = new Element("p");
        element.addClass("header");
        element.toggleClass("header");
        assertFalse(element.hasClass("header"));
        element.toggleClass("header");
        assertTrue(element.hasClass("header"));
    }

    @Test
    public void appendChildTest() {
        Element parent = new Element("div");
        Node child = Parser.parse("<p>child</p>", "");
        parent.appendChild(child);

        assertEquals(1, parent.children().size());
    }

    @Test
    public void childNodeSizeTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(2, parent.childNodeSize());
    }

    @Test
    public void prependChildTest() {
        Element parent = new Element("div");
        Node child = Parser.parse("<p>child</p>", "");
        parent.prependChild(child);

        assertEquals(1, parent.children().size());
        assertEquals("child", parent.child(0).text());
    }

    @Test
    public void hasChildNodesTest() {
        Element parent = new Element("div");
        assertFalse(parent.hasChildNodes());

        Node child = Parser.parse("<p>Child</p>", "");
        parent.appendChild(child);
        assertTrue(parent.hasChildNodes());
    }

    @Test
    public void ensureChildNodesTest() {
        Element element = new Element("div");
        List<Node> nodes = element.childNodes();

        assertEquals(nodes, element.ensureChildNodes());
    }

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        Node child = Parser.parse("<p>Child</p>", "");
        element.appendChild(child);

        Element clone = element.clone();
        assertEquals(clone, element);
        assertNotSame(clone, element);
    }

    @Test
    public void rootTest() {
        Element element = new Element("div");
        Element root = element.root();

        assertEquals(root, element);
    }

}