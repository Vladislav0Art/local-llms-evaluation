package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void tagNameScenarioTest() {
        Element el = new Element("testName");
        assertEquals("testname", el.tagName());
    }

    @Test
    public void tagNameWithParameterScenarioTest() {
        Element el = new Element("testName");
        el.tagName("newTagName");
        assertEquals("newtagname", el.tagName());
    }

    @Test
    public void hasChildNodesScenarioTest() {
        Element el = new Element("testName");
        assertFalse(el.hasChildNodes());
    }

    @Test
    public void childNodeSizeScenarioTest() {
        Element el = new Element("testName");
        assertEquals(0, el.childNodeSize());
    }

    @Test
    public void attrScenarioTest() {
        Element el = new Element("testName");
        el.attr("testAttr", "testValue");
        assertEquals("testValue", el.attr("testAttr"));
    }

    @Test
    public void datasetScenarioTest() {
        Element el = new Element("testName");
        assertTrue(el.dataset().isEmpty());
    }

    @Test
    public void emptyScenarioTest() {
        Element parent = new Element("testName");
        Element child = new Element("child");
        parent.appendChild(child);

        assertTrue(parent.hasChildNodes());
        assertEquals(1, parent.childNodeSize());

        parent.empty();

        assertFalse(parent.hasChildNodes());
        assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void outerHtmlScenarioTest() {
        Element element = new Element("div");
        Tag tag = element.tag();

        assertEquals("<div></div>", tag.toString());
    }

    @Test
    public void cloneScenarioTest() {
        Element el = new Element("testName");
        Element elClone = el.clone();

        assertTrue(el != elClone && el.getClass() == elClone.getClass() && el.equals(elClone));
    }

    @Test
    public void textScenarioTest() {
        Element element = new Element("testName");
        element.text("Hello, World!");

        assertEquals("Hello, World!", element.text());
    }

}