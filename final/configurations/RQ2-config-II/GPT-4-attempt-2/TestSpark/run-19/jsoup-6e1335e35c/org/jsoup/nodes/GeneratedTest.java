package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("testTag");
        assertEquals("testTag", element.tagName());
    }

    @Test
    public void tagNameChangeTest() {
        Element element = new Element("testTag");
        element.tagName("newTestTag");
        assertEquals("newTestTag", element.tagName());
    }

    @Test
    public void isBlockTest() {
        Element blockElement = new Element("div");
        assertTrue(blockElement.isBlock());
        Element inlineElement = new Element("span");
        assertFalse(inlineElement.isBlock());
    }

    @Test
    public void idTest() {
        Element element = new Element("testTag");
        element.id("testId");
        assertEquals("testId", element.id());
    }

    @Test
    public void childTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

    @Test
    public void attrTest() {
        Element element = new Element("testTag");
        element.attr("key", "value");
        assertEquals("value", element.attr("key"));
    }

    @Test
    public void attrBooleanTest() {
        Element element = new Element("testTag");
        element.attr("key", true);
        assertEquals("true", element.attr("key"));
    }

    @Test
    public void childNodesTest() {
        Element parent = new Element("parent");
        assertFalse(parent.hasChildNodes());
        parent.appendChild(new Element("child"));
        assertTrue(parent.hasChildNodes());
    }

    @Test
    public void classNamesTest() {
        Element element = new Element("testTag");
        element.addClass("testClass");
        assertTrue(element.hasClass("testClass"));
    }

    @Test
    public void removeClassTest() {
        Element element = new Element("testTag");
        element.addClass("testClass");
        element.removeClass("testClass");
        assertFalse(element.hasClass("testClass"));
    }

    @Test
    public void selectFirstTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.selectFirst("child"));
    }

    @Test
    public void cloneTest() {
        Element element = new Element("testTag");
        Element clone = element.clone();
        assertEquals(element.tagName(), clone.tagName());
        assertNotEquals(System.identityHashCode(element), System.identityHashCode(clone));
    }

    @Test
    public void htmlTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        child.html("<div>test content</div>");
        assertEquals("<div>test content</div>", child.html());
        parent.appendChild(child);
        assertEquals("<child><div>test content</div></child>", parent.html());
    }

}