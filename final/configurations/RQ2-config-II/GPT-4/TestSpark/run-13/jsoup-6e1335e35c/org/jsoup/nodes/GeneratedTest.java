package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void tagNameNullTest() {
        try {
            Element element = new Element(null);
        } catch (IllegalArgumentException e) {
            assertEquals("tagName must not be null", e.getMessage());
        }
    }

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        assertTrue(element.tagName().equals("div"));
    }

    @Test
    public void appendChildTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        assertTrue(parent.childNodeSize() == 1);
        assertEquals(parent.child(0), child);
    }

    @Test
    public void appendChildrenTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChildren(Arrays.asList(child1, child2));
        assertTrue(parent.childNodeSize() == 2);
        assertEquals(parent.child(0), child1);
        assertEquals(parent.child(1), child2);
    }

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("id", "testId");
        assertTrue(element.hasAttributes());
        assertEquals(element.attr("id"), "testId");
    }

    @Test
    public void removeAttrTest() {
        Element element = new Element("div");
        element.attr("id", "testId");
        element.removeAttr("id");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        assertTrue(element.baseUri().equals(""));
        element.attr("href", "http://test.com");
        assertTrue(element.baseUri().equals("http://test.com"));
    }

    @Test
    public void elementsByAttributeTest() {
        Element element = new Element("div");
        element.attr("id", "1");
        Elements result = element.getElementsByAttribute("id");
        assertNotNull(result);
        assertTrue(result.size() == 1);
        assertTrue(result.get(0) == element);
    }

    @Test
    public void setClassNamesTest() {
        Element element = new Element("div");
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("testClass");
        element.setClassNames(set);
        assertTrue(element.hasClass("testClass"));
    }

    @Test
    public void forEachTest() {
        Element element = new Element("div");
        element.attr("id", "1");
        element.forEach(e -> e.attr("id", "2"));
        assertTrue(element.attr("id").equals("2"));
    }

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        element.attr("id", "1");
        Element cloned = element.clone();
        assertTrue(cloned != element);
        assertTrue(cloned.attr("id").equals("1"));
    }

}