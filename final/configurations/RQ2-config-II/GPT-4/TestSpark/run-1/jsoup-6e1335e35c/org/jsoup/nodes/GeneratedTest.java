package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void ElementDefaultConstructorTest() {
        Element element = new Element("tag");
        assertNotNull(element);
    }

    @Test
    public void ElementParameterizedConstructorTest() {
        Element element = new Element(Tag.valueOf("p"), "https://www.example.com", null);
        assertNotNull(element);
    }

    @Test
    public void hasChildNodesTest() {
        Element element = new Element("tag");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void hasAttributesTest() {
        Element element = new Element("tag");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("tag");
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void setBaseUriTest() {
        Element element = new Element("tag");
        element.setBaseUri("https://www.example.com");
        assertEquals("https://www.example.com", element.baseUri());
    }

    @Test
    public void nodeNameTest() {
        Element element = new Element("tag");
        assertEquals("tag", element.nodeName());
    }

    @Test
    public void normalNameTest() {
        Element element = new Element("Tag");
        assertEquals("tag", element.normalName());
    }

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        assertEquals("tag", element.tagName());
    }

    @Test
    public void isBlockTest() {
        Element element = new Element("p");
        assertFalse(element.isBlock());
    }

    @Test
    public void setIdAndGetIdTest() {
        Element element = new Element("tag");
        element.id("id");
        assertEquals("id", element.id());
    }

    @Test
    public void prependChildTest() {
        Element parent = new Element("tag");
        Element child = new Element("childtag");
        parent.prependChild(child);
        assertEquals(child, parent.child(0));
    }

    @Test
    public void appendChildTest() {
        Element parent = new Element("tag");
        Element child = new Element("childtag");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

    @Test
    public void prependTextAndGetTextTest() {
        Element element = new Element("tag");
        element.prependText("Hello");
        assertEquals("Hello", element.text());
    }

    @Test
    public void classNamesTest() {
        Element element = new Element("tag");
        Set<String> classNames = new HashSet<>();
        classNames.add("class1");
        classNames.add("class2");
        element.classNames(classNames);
        assertTrue(element.hasClass("class1"));
        assertTrue(element.hasClass("class2"));
    }

    @Test
    public void cloneTest() {
        Element element1 = new Element("tag1");
        Element element2 = element1.clone();
        assertFalse(element1 == element2);
    }

    @Test
    public void htmlTest() {
        Element element = new Element("tag");
        element.html("<p>Hello world</p>");
        assertEquals("<p>Hello world</p>", element.html());
    }

}