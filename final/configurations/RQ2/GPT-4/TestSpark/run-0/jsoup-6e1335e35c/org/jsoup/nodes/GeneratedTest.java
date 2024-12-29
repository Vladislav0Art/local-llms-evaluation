package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        Assert.assertEquals("div", element.tagName());
    }

    @Test
    public void hasChildNodesTest() {
        Element element = new Element("div");
        element.appendChild(new Element("span"));
        Assert.assertTrue(element.hasChildNodes());
    }

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("div");
        element.appendChild(new Element("span"));
        Assert.assertEquals(1, element.childNodeSize());
    }

    @Test
    public void appendChildTest() {
        Element element = new Element("div");
        Element child = new Element("span");
        element.appendChild(child);
        Assert.assertEquals(1, element.childNodeSize());
    }

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("class", "myClass");
        Assert.assertEquals("myClass", element.attr("class"));
    }

    @Test
    public void htmlTest() {
        Element element = new Element("div");
        element.html("<span>Test</span>");
        Assert.assertEquals("<span>Test</span>", element.html());
    }

    @Test
    public void textTest() {
        Element element = new Element("div");
        element.text("Text test");
        Assert.assertEquals("Text test", element.text());
    }

    @Test
    public void parentTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        Assert.assertEquals(parent, child.parent());
    }

    @Test
    public void siblingElementsTest() {
        Element element = Jsoup.parseBodyFragment("<div><span></span><p></p><a></a></div>").body();
        Elements siblings = element.child(0).siblingElements();
        Assert.assertTrue(siblings.size() == 2);
    }

    @Test
    public void getElementsByTagTest() {
        Element element = Jsoup.parseBodyFragment("<div><span></span><p></p><a></a></div>").body();
        Elements elements = element.getElementsByTag("a");
        Assert.assertTrue(elements.size() == 1);
    }

    @Test
    public void getElementsByClassTest() {
        Element element = Jsoup.parseBodyFragment("<div><span class='myClass'></span><p class='myClass'></p><a></a></div>").body();
        Elements elements = element.getElementsByClass("myClass");
        Assert.assertTrue(elements.size() == 2);
    }

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        Element clone = element.clone();
        Assert.assertEquals(element, clone);
    }

}