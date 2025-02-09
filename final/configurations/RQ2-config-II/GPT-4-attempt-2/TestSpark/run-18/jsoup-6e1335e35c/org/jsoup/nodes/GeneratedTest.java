package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void attrStringStringTest() {
        Element element = createElement();
        element.attr("class", "testClass");
        assertTrue(element.hasClass("testClass"));
    }

    @Test
    public void attrStringBooleanTest() {
        Element element = createElement();
        element.attr("important", true);
        assertEquals("true", element.attr("important"));
    }

    @Test
    public void tagNameTest() {
        Element element = createElement();
        assertEquals("p", element.tagName());
    }

    @Test
    public void addClassTest() {
        Element element = createElement();
        element.addClass("test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    public void removeClassTest() {
        Element element = createElement();
        element.addClass("test");
        assertTrue(element.hasClass("test"));
        element.removeClass("test");
        assertTrue(!element.hasClass("test"));
    }

    @Test
    public void hasClassTest() {
        Element element = createElement();
        element.addClass("test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    public void childTest() {
        Element parent = createElement();
        Element child = createElement();
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

    @Test
    public void appendChildTest() {
        Element parent = createElement();
        Element child = createElement();
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
        assertEquals(child, parent.child(0));
    }

    @Test
    public void appendTextTest() {
        Element element = createElement();
        element.appendText("test");
        assertEquals("test", element.text());
    }

    @Test
    public void htmlTest() {
        Element element = createElement();
        element.html("<div>test</div>");
        assertEquals("<div>test</div>", element.html());
    }

    @Test
    public void hasTextTest() {
        Element element = createElement();
        element.text("test");
        assertTrue(element.hasText());
    }

    @Test
    public void classNamesTest() {
        Element element = createElement();
        Set<String> classes = new LinkedHashSet<>();
        classes.add("test");
        classes.add("test2");
        element.classNames(classes);
        assertEquals(classes, element.classNames());
    }

    private Element createElement() {
        return new Element(Tag.valueOf("p"), "");
    }

}