package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void ElementHasChildNodesTest() {
        Element element = new Element("div");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void ElementHasAttributesTest() {
        Element element = new Element("div");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void ElementTagNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void ElementIdTest() {
        Element element = new Element("div");
        element.id("example");
        assertEquals("example", element.id());
    }

    @Test
    public void ElementAttrTest() {
        Element element = new Element("div");
        element.attr("class", "container");
        assertEquals("container", element.attributes().get("class"));
    }

    @Test
    public void ElementParentTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void ElementChildTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

    @Test
    public void ElementChildrenSizeTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        List<Node> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        parent.appendChildren(children);
        assertEquals(2, parent.childrenSize());
    }

    @Test
    public void ElementChildElementsListTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        List<Node> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        parent.appendChildren(children);
        assertEquals(2, parent.childElementsList().size());
    }

    @Test
    public void ElementAppendChildTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(1, parent.childrenSize());
    }

    @Test
    public void ElementAppendTextTest() {
        Element parent = new Element("div");
        parent.appendText("Hello World");
        assertEquals("Hello World", parent.text());
    }

    @Test
    public void ElementAfterTest() {
        Element parent = new Element("div");
        Element node = new Element("span");
        parent.after(node);
        assertEquals(1, parent.nextSibling().siblingIndex());
    }

    @Test
    public void ElementWrapTest() {
        Element element = new Element("div");
        element.text("Hello World");
        element.wrap("<section></section>");
        assertEquals("section", element.parent().tagName());
    }

    @Test
    public void ElementClassNameTest() {
        Element element = new Element("div");
        element.addClass("test");
        assertEquals("test", element.className());
    }

    @Test
    public void ElementRemoveClassTest() {
        Element element = new Element("div");
        element.addClass("test");
        element.removeClass("test");
        assertEquals("", element.className());
    }

    @Test
    public void ElementValTest() {
        Element element = new Element("input");
        element.val("Hello");
        assertEquals("Hello", element.val());
    }

    @Test
    public void ElementForEachTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        element.forEach(e -> e.addClass("test"));
        assertEquals("test", child.className());
    }

    @Test
    public void ElementClearAttributesTest() {
        Element element = new Element("input");
        element.attr("type", "text");
        element.clearAttributes();
        assertFalse(element.hasAttributes());
    }

    @Test
    public void ElementRootTest() {
        Element element = new Element("html");
        assertEquals("html", element.root().nodeName());
    }

}