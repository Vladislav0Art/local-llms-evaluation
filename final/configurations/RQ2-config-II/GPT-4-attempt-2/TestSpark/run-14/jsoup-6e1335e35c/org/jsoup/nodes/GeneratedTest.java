package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void ElementConstructorTest() {
        Element el = new Element("div");
        Assert.assertEquals("<div></div>", el.toString());

        el = new Element(Tag.valueOf("p"), "http://example.com");
        Assert.assertEquals("<p></p>", el.toString());

        Attributes attr = new Attributes();
        attr.put("class", "btn");
        el = new Element(Tag.valueOf("a"), "http://example.com", attr);
        Assert.assertEquals("<a class=\"btn\"></a>", el.toString());
    }

    @Test
    public void tagNameTest() {
        Element el = new Element("div");
        el.tagName("p");
        Assert.assertEquals("<p></p>", el.toString());
    }

    @Test
    public void attrTest() {
        Element el = new Element("div");
        el.attr("class", "btn");
        Assert.assertEquals("<div class=\"btn\"></div>", el.toString());
    }

    @Test
    public void parentTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        Assert.assertEquals(parent, child.parent());
    }

    @Test
    public void textTest() {
        Element el = new Element("p");
        el.text("Hello, World!");
        Assert.assertEquals("<p>Hello, World!</p>", el.toString());
    }

    @Test
    public void selectTest() {
        Element el = new Element("div");
        el.attr("class", "btn");
        Elements selectedElements = el.select(".btn");
        Assert.assertEquals(1, selectedElements.size());
    }

    @Test
    public void childTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        parent.appendChild(child2);

        Assert.assertEquals(child1, parent.child(0));
        Assert.assertEquals(child2, parent.child(1));
    }

    @Test
    public void idTest() {
        Element el = new Element("div");
        el.id("myDiv");
        Assert.assertEquals("<div id=\"myDiv\"></div>", el.toString());
    }

}