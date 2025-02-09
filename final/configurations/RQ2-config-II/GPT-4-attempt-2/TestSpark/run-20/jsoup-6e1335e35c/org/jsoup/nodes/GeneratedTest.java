package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void ElementConstructorTest() {
        Tag tag = Tag.valueOf("p");
        Element element = new Element(tag, "http://base.uri");
        assertNotNull(element);
    }

    @Test
    public void hasChildNodesTest() {
        Element element = new Element("div");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void hasAttributesTest() {
        Element element = new Element("div");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        element.setBaseUri("http://base.uri");
        assertEquals("http://base.uri", element.baseUri());
    }

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("div");
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void nodeNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.nodeName());
    }

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void isBlockTest() {
        Element element = new Element("div");
        assertTrue(element.isBlock());
    }

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.attr("id", "someId");
        assertEquals("someId", element.id());
    }

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("name", "value");
        assertEquals("value", element.attr("name"));
    }

    @Test
    public void datasetTest() {
        Element element = new Element("div");
        element.attr("data-name", "value");
        assertTrue(element.dataset().containsKey("name"));
    }

    @Test
    public void selectFirstTest() {
        Element element = new Element("div");
        Element child = element.appendElement("p");
        child.attr("class", "someClass");
        assertEquals("p", element.selectFirst(".someClass").tagName());
    }

    @Test
    public void isCSSQueryTest() {
        Element element = new Element("div");
        element.attr("class", "someClass");
        assertTrue(element.is(".someClass"));
    }

    @Test
    public void isEvaluatorTest() {
        Element root = new Element("div");
        Element child = new Element("span");
        root.appendChild(child);
        Evaluator evaluator = Evaluator.TagEndsWith("span");
        assertTrue(root.is(evaluator));
    }

    @Test
    public void siblingElementsTest() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");
        assertEquals(1, child1.siblingElements().size());
        assertEquals(1, child2.siblingElements().size());
    }

    @Test
    public void previousElementSiblingTest() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");
        assertEquals("p", child2.previousElementSibling().tagName());
    }

    @Test
    public void firstElementSiblingTest() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");
        assertEquals("p", child2.firstElementSibling().tagName());
    }

    @Test
    public void lastElementChildTest() {
        Element parent = new Element("div");
        Element child1 = parent.appendElement("p");
        parent.appendElement("span");
        assertEquals("p", parent.firstElementChild().tagName());
    }

    @Test
    public void getElementsByTagTest() {
        Element parent = new Element("div");
        parent.appendElement("p");
        parent.appendElement("span");
        assertEquals(1, parent.getElementsByTag("p").size());
    }

    @Test
    public void getElementByIdTest() {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        child.attr("id", "someId");
        assertEquals("p", parent.getElementById("someId").tagName());
    }

    @Test
    public void getElementsByAttributeTest() {
        Element parent = new Element("div");
        Element child = parent.appendElement("p");
        child.attr("data-name", "value");
        assertEquals(1, parent.getElementsByAttribute("data-name").size());
    }

    @Test
    public void classNameTest() {
        Element element = new Element("div");
        element.attr("class", "className");
        assertEquals("className", element.className());
    }

    @Test
    public void addClassTest() {
        Element element = new Element("div");
        element.addClass("newClass");
        assertTrue(element.hasClass("newClass"));
    }

    @Test
    public void removeClassTest() {
        Element element = new Element("div");
        element.addClass("newClass");
        element.removeClass("newClass");
        assertFalse(element.hasClass("newClass"));
    }

    @Test
    public void toggleClassTest() {
        Element element = new Element("div");
        element.toggleClass("newClass");
        assertTrue(element.hasClass("newClass"));
        element.toggleClass("newClass");
        assertFalse(element.hasClass("newClass"));
    }

}