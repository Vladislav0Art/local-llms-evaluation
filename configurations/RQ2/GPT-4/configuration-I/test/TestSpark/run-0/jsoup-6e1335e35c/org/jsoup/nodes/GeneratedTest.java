package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void tagNameInitializationTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        assertEquals("p", element.tagName());
    }

    @Test
    public void tagInitializationTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        assertEquals("p", element.tag().getName());
    }

    @Test
    public void changeTagNameTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        element.tagName("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void attributesTest() {
        Attributes attributes = new Attributes();
        String baseUri = "http://example.com/";
        attributes.put("key", "value");
        Element element = new Element(Tag.valueOf("p"), baseUri, attributes);
        assertEquals(1, element.attributes().size());
        assertTrue(element.hasAttributes());
    }

    @Test
    public void baseUriEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Element element = new Element(Tag.valueOf("p"), "", attributes);
        assertEquals("", element.baseUri());
    }

    @Test
    public void setBaseUriTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        String baseUri = "http://example.com";
        element.setBaseUri(baseUri);
        assertEquals(baseUri, element.baseUri());
    }

    @Test
    public void appendChildTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        assertEquals(1, parent.children().size());
        assertEquals(child, parent.child(0));
    }

    @Test
    public void prependChildTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("span"), "");

        parent.appendChild(child1);
        parent.prependChild(child2);

        assertEquals(2, parent.children().size());
        assertEquals(child2, parent.child(0));
    }

    @Test
    public void removeChildTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        parent.removeChild(child);
        assertEquals(0, parent.children().size());
    }

    @Test
    public void textTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        String text = "Test text";
        element.text(text);
        assertEquals(text, element.text());
    }

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        String html = "<p>Test text</p>";
        element.html(html);
        assertEquals(html, element.html());
    }

    @Test
    public void cloneTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        Element clonedElement = element.clone();
        assertNotSame(element, clonedElement);
        assertEquals(element.html(), clonedElement.html());
    }

}