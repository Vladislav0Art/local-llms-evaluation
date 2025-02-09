package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void ElementTagConstructorTest() {
        Element element = new Element("div");
        Assert.assertNotNull(element);
    }

    @Test
    public void ElementTagBaseAttributesConstructorTest() {
        Element element = new Element(Tag.valueOf("div"), "http://www.google.com",
                new Attributes());
        Assert.assertNotNull(element);
    }

    @Test
    public void hasChildNodesEmptyTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.hasChildNodes());
    }

    @Test
    public void hasAttributesFalseTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.hasAttributes());
    }

    @Test
    public void tagNameTest() {
        String tag = "div";
        Element element = new Element(tag);
        Assert.assertEquals(tag, element.tagName());
    }

    @Test
    public void isBlockFalseTest() {
        Element element = new Element("div");
        Assert.assertFalse(element.isBlock());
    }

    @Test
    public void attrKeyAndValueTest() {
        Element element = new Element("div");
        String key = "testKey";
        String value = "testValue";
        element.attr(key, value);
        Map<String, String> attributes = element.dataset();
        Assert.assertEquals(value, attributes.get(key));
    }

    @Test
    public void childElementTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        Assert.assertEquals(child, element.child(0));
    }

    @Test
    public void appendTextTest() {
        Element element = new Element("div");
        String text = "This is a test";
        element.appendText(text);
        Assert.assertEquals(text, element.text());
    }

    @Test
    public void prependTextTest() {
        Element element = new Element("div");
        String text = "This is a test";
        element.prependText(text);
        Assert.assertEquals(text, element.text());
    }

    @Test
    public void siblingsTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Assert.assertEquals(child2, child1.nextElementSibling());
        Assert.assertEquals(child1, child2.previousElementSibling());
    }

    @Test
    public void addClassTest() {
        Element element = new Element("div");
        String className = "test";
        element.addClass(className);
        Assert.assertTrue(element.hasClass(className));
    }

    @Test
    public void removeClassTest() {
        Element element = new Element("div");
        String className = "test";
        element.addClass(className);
        element.removeClass(className);
        Assert.assertFalse(element.hasClass(className));
    }

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        Element clone = element.clone();
        Assert.assertNotSame(clone, element);
    }

}