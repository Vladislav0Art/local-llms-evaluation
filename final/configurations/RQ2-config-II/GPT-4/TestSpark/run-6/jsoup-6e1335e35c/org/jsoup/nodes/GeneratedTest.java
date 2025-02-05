package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeFilter;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void hasChildNodesWithChildTest() {
        Element element = new Element("p");
        element.appendChild(new Element("span"));
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void hasChildNodesWithoutChildTest() {
        Element element = new Element("p");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void hasAttributesWithAttributesTest() {
        Element element = new Element(Tag.valueOf("p"), "", new Attributes());
        element.attr("key", "value");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void hasAttributesWithoutAttributesTest() {
        Element element = new Element(Tag.valueOf("p"), "", new Attributes());
        assertFalse(element.hasAttributes());
    }

    @Test
    public void baseUriTest() {
        Element element = new Element(Tag.valueOf("p"), "http://abc.com", new Attributes());
        assertEquals("http://abc.com", element.baseUri());
    }

    @Test
    public void childNodeSizeWithChildTest() {
        Element parent = new Element(Tag.valueOf("p"), "", new Attributes());
        Element child = new Element(Tag.valueOf("span"), "", new Attributes());
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
    }

    @Test
    public void childNodeSizeWithoutChildTest() {
        Element parent = new Element(Tag.valueOf("p"), "", new Attributes());
        assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void isBlockTest() {
        Element blockElement = new Element("div");
        assertTrue(blockElement.isBlock());

        Element inlineElement = new Element("span");
        assertFalse(inlineElement.isBlock());
    }

    @Test
    public void selectFirstNotFoundTest() {
        Element element = new Element("div");
        assertNull(element.selectFirst("p"));
    }

    @Test
    public void selectFirstFoundTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        assertNotNull(parent.selectFirst("p"));
    }

    @Test
    public void selectFirstEvaluatorTest() {
        Evaluator evaluator = new Evaluator.Tag("p");
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        assertNotNull(parent.selectFirst(evaluator));
    }

    @Test
    public void doCloneTest() {
        Element element = new Element("p");
        Element cloned = element.doClone(element);
        assertEquals(element.tagName(), cloned.tagName());
    }

    @Test
    public void traverseTest() {
        Element element = new Element("p");
        element.traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int i) {
                assertEquals("p", node.nodeName());
            }

            @Override
            public void tail(Node node, int i) {
                assertEquals("p", node.nodeName());
            }
        });
    }

    @Test
    public void filterTest() {
        Element element = new Element("p");
        element.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {
                return FilterResult.REMOVE;
            }

            @Override
            public FilterResult tail(Node node, int depth) {
                return FilterResult.REMOVE;
            }
        });
    }

}