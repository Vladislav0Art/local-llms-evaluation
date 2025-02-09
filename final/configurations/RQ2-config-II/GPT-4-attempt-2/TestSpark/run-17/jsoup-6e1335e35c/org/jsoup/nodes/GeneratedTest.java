package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("p");
        assertEquals("p", element.tagName());
    }

    @Test
    public void attrKeyValueTest() {
        Element element = new Element("input");
        element.attr("type", "text");
        assertEquals("text", element.attr("type"));
        assertFalse(element.attributes().isEmpty());
    }

    @Test
    public void attrKeyBooleanTest() {
        Element element = new Element("input");
        element.attr("disabled", true);
        assertEquals("true", element.attr("disabled"));
    }

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("root");
        assertEquals("root", element.id());
    }

    @Test
    public void baseUriTest() {
        String baseUri = "http://example.com";
        Tag tag = Tag.valueOf("a");
        Attributes attributes = new Attributes();
        Element element = new Element(tag, baseUri, attributes);
        assertEquals(baseUri, element.baseUri());
    }

    @Test
    public void dataTest() {
        Element element = new Element("p");
        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("testData", "testValue");
        element.dataset().putAll(dataSet);

        assertEquals("testValue", element.dataset().get("testData"));
    }

    @Test
    public void selectInvalidCssQueryTest() {
        Element element = new Element("div");
        element.select("%");
    }

    @Test
    public void selectNullEvaluatorTest() {
        Element element = new Element("div");
        element.select((Evaluator) null);
    }

    @Test
    public void cloneTest() {
        Element element = new Element("p");
        Element clonedElement = element.clone();

        assertNotEquals(System.identityHashCode(element), System.identityHashCode(clonedElement));
        assertEquals(element.nodeName(), clonedElement.nodeName());
    }

    @Test
    public void selectFirstTest() {
        Element parent = new Element("parent");
        parent.appendChild(new Element("child"));
        assertNotNull(parent.selectFirst("child"));
    }

    @Test
    public void ensureChildNodesTest() {
        Element parent = new Element("parent");
        parent.appendElement("child");
        assertFalse(parent.ensureChildNodes().isEmpty());
    }

    @Test
    public void appendChildTest() {
        Element parent = new Element("parent");
        parent.appendChild(new Element("child"));
        assertEquals(1, parent.children().size());
    }

    @Test
    public void cssSelectorTest() {
        Element element = new Element("input");
        element.attr("type", "text");
        assertEquals("input[type=text]", element.cssSelector());
    }

    @Test
    public void getElementsByAttributeValueTest() {
        Element parent = new Element("div");
        Element child = new Element("input");
        child.attr("type", "text");
        parent.appendChild(child);
        assertEquals(1, parent.getElementsByAttributeValue("type", "text").size());
    }

    @Test
    public void removeInvalidAttributeTest() {
        Element element = new Element("input");
        element.removeAttr("invalid");
    }

}