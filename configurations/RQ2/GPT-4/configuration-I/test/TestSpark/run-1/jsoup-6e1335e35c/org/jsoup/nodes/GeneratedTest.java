package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void tagNameValidInputTest() {
        Element element = new Element("tag");
        element.tagName("newTag");
        assertEquals("newTag", element.tagName());
    }

    @Test
    public void idValidInputTest() {
        Element element = new Element("tag");
        element.id("elementId");
        assertEquals("elementId", element.id());
    }

    @Test
    public void hasAttributesTrueTest() {
        Element element = new Element(Tag.valueOf("tag"), "http://localhost");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void hasChildNodesTrueTest() {
        Element element = new Element("tag");
        Element child = new Element("childTag");
        element.appendChild(child);
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void attrStringValuesTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        assertEquals("value", element.attributes().get("key"));
    }

    @Test
    public void attrBooleanValuesTest() {
        Element element = new Element("tag");
        element.attr("key", true);
        assertEquals("true", element.attributes().get("key"));
    }

    @Test
    public void ensureChildNodesTest() {
        Element element = new Element("tag");
        Element child = new Element("childTag");
        element.appendChild(child);
        assertNotNull(element.ensureChildNodes());
        assertEquals(1, element.ensureChildNodes().size());
    }

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("tag");
        Element child1 = new Element("childTag1");
        Element child2 = new Element("childTag2");
        element.appendChild(child1);
        element.appendChild(child2);
        assertEquals(2, element.childNodeSize());
    }

    @Test
    public void selectCssQueryTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        parent.appendChild(child1);
        parent.appendChild(child2);

        Elements selectedChild = parent.select("child");
        assertEquals(2, selectedChild.size());
    }

    @Test
    public void cloneTest() {
        Element element = new Element("tag");
        Element clonedElement = element.clone();
        assertEquals(element, clonedElement);
    }

    @Test
    public void childrenSizeTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(2, parent.childrenSize());
    }

}