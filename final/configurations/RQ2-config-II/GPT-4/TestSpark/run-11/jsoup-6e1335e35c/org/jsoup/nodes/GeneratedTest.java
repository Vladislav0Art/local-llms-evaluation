package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void hasChildNodesTest() {
        Element e = new Element("tag");
        Assert.assertFalse("Check new Element has no children", e.hasChildNodes());
        e.appendChild(new Element("child"));
        Assert.assertTrue("Check Element with child", e.hasChildNodes());
    }

    @Test
    public void ensureChildNodesTest() {
        Element e = new Element("tag");
        List<Node> childNodes = e.ensureChildNodes();
        Assert.assertNotNull("Ensure child nodes are not null", childNodes);
    }

    @Test
    public void tagNameTest() {
        Element e = new Element("mytag");
        Assert.assertEquals("mytag", e.tagName());
        e.tagName("newtag");
        Assert.assertEquals("newtag", e.tagName());
    }

    @Test
    public void attrTest() {
        Element e = new Element("tag");
        e.attr("key", "value");
        Assert.assertEquals("value", e.attr("key"));
    }

    @Test
    public void datasetTest() {
        Element e = new Element("tag");
        e.attr("data-key", "value");
        Assert.assertEquals("value", e.dataset().get("key"));
    }

    @Test
    public void selectTest() {
        Element e = new Element("tag");
        Elements result = e.select("tag");
        Assert.assertNotNull(result);
    }

    @Test
    public void appendChildTest() {
        Element e = new Element("tag");
        e.appendChild(new Element("child"));
        Assert.assertEquals("child", e.child(0).tagName());
    }

    @Test
    public void appendToTest() {
        Element parent = new Element("parent");
        Element child = new Element("child").appendTo(parent);
        Assert.assertTrue(parent == child.parent());
    }

    @Test
    public void prependChildTest() {
        Element e = new Element("tag");
        e.prependChild(new Element("child"));
        Assert.assertEquals("child", e.child(0).tagName());
    }

    @Test
    public void insertChildrenTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        parent.insertChildren(0, Arrays.asList(child1, child2));
        Assert.assertEquals("child1", parent.child(0).tagName());
        Assert.assertEquals("child2", parent.child(1).tagName());
    }

    @Test
    public void prependTest() {
        Element e = new Element("tag");
        e.prepend("<child></child>");
        Assert.assertEquals("child", e.child(0).tagName());
    }

    @Test
    public void wrapTest() {
        Element child = new Element("child");
        child.wrap("<parent></parent>");
        Element parent = child.parent();
        Assert.assertEquals("parent", parent.tagName());
    }

    @Test
    public void hasClassTest() {
        Element e = new Element("tag", new Attributes());
        e.addClass("new-class");
        Assert.assertTrue(e.hasClass("new-class"));
    }

    @Test
    public void valTest() {
        Element e = new Element(Tag.valueOf("input"), "");
        e.val("value");
        Assert.assertEquals("value", e.val());
    }

    @Test
    public void htmlTest() {
        Element e = new Element("tag");
        e.html("<child></child>");
        Assert.assertEquals("<child></child>", e.html());
    }

    @Test
    public void cloneTest() {
        Element e = new Element("tag");
        Element clone = e.clone();
        Assert.assertNotSame(e, clone);
        Assert.assertEquals(e, clone);
    }

}