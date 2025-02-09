package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        Assert.assertEquals("tag", element.tagName());
    }

    @Test
    public void attrTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        Assert.assertEquals("value", element.attr("key"));
    }

    @Test
    public void idTest() {
        Element element = new Element("tag");
        element.id("id123");
        Assert.assertEquals("id123", element.id());
    }

    @Test
    public void hasAttributesTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        Assert.assertTrue(element.hasAttributes());
    }

    @Test
    public void childNodeSizeTest() {
        Element parentElement = new Element("parent");
        Element childElement = new Element("child");
        parentElement.appendChild(childElement);
        Assert.assertEquals(1, parentElement.childNodeSize());
    }

    @Test
    public void baseUriTest() {
        Element element = new Element("tag", "http://mock-uri.com");
        Assert.assertEquals("http://mock-uri.com", element.baseUri());
    }

    @Test
    public void isEmptyTest() {
        Element element = new Element("tag");
        Assert.assertTrue(element.isEmpty());
    }

    @Test
    public void prependTest() {
        Element parentElement = new Element("parent");
        Element childElement = new Element("child");
        parentElement.prepend(childElement.outerHtml());
        Assert.assertEquals(childElement.outerHtml(), parentElement.child(0).outerHtml());
    }

    @Test
    public void wrapTest() {
        Element element = new Element("tag");
        element.wrap("<article></article>");
        Assert.assertEquals("article", element.parent().tagName());
    }

    @Test
    public void textTest() {
        Element element = new Element("tag");
        element.text("Element Text");
        Assert.assertEquals("Element Text", element.text());
    }

    @Test
    public void dataTest() {
        Element element = new Element("tag");
        element.prepend("<data>This is a data tag</data>");
        Assert.assertEquals("<data>This is a data tag</data>", element.child(0).outerHtml());
        Assert.assertEquals("This is a data tag", element.child(0).text());
    }

    @Test
    public void cloneTest() {
        Element original = new Element("tag");
        Element clone = original.clone();
        Assert.assertEquals(original, clone);
    }

    @Test
    public void removeAttrTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        element.removeAttr("key");
        Assert.assertFalse(element.hasAttributes());
    }

}