package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Test
    public void tagNameScenarioTest() {
        Element element = new Element("p");
        assertEquals("p", element.tagName());
    }

    @Test
    public void hasAttributesScenarioTest() {
        Element element = new Element("p");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void attributesScenarioTest() {
        Element element = new Element("p");
        assertEquals(0, element.attributes().size());
    }

    @Test
    public void childNodeSizeScenarioTest() {
        Element element = new Element("p");
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void baseUriScenarioTest() {
        Element element = new Element("p");
        assertEquals("", element.baseUri());
    }

    @Test
    public void nodeNameScenarioTest() {
        Element element = new Element("p");
        assertEquals("p", element.nodeName());
    }

    @Test
    public void normalNameScenarioTest() {
        Element element = new Element("P");
        assertEquals("p", element.normalName());
    }

    @Test
    public void isBlockScenarioTest() {
        Element element = new Element("div");
        assertTrue(element.isBlock());
    }

    @Test
    public void idScenarioTest() {
        Element element = new Element("p");
        element.attr("id", "elementId");
        assertEquals("elementId", element.id());
    }

    @Test
    public void attrScenarioTest() {
        Element element = new Element("p");
        element.attr("class", "text-content");
        assertEquals("text-content", element.attr("class"));
    }

    @Test
    public void datasetScenarioTest() {
        Element element = new Element("p");
        element.attr("data-test", "test-data");
        assertTrue(element.dataset().containsKey("test"));
    }

    @Test
    public void parentScenarioTest() {
        Element parentElement = new Element("div");
        Element childElement = new Element("p");
        parentElement.appendChild(childElement);
        assertEquals(parentElement, childElement.parent());
    }

    @Test
    public void childScenarioTest() {
        Element parentElement = new Element("div");
        Element childElement = new Element("p");
        parentElement.appendChild(childElement);
        assertEquals(childElement, parentElement.child(0));
    }

    @Test
    public void childrenSizeScenarioTest() {
        Element parentElement = new Element("div");
        Element childElement1 = new Element("p");
        Element childElement2 = new Element("span");
        parentElement.appendChild(childElement1);
        parentElement.appendChild(childElement2);
        assertEquals(2, parentElement.childrenSize());
    }

}