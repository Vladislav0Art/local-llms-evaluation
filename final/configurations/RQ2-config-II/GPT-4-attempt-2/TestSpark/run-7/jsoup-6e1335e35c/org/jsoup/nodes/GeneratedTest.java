package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void ElementTagConstructorTest() {
        Tag tagMock = mock(Tag.class);
        Element element = new Element(tagMock);

        Assert.assertNotNull(element);
        Assert.assertEquals(tagMock, element.tag());
    }

    @Test
    public void ElementTagUriAttributesConstructorTest() {
        Tag tagMock = mock(Tag.class);
        Attributes attributesMock = mock(Attributes.class);
        Element element = new Element(tagMock, "http://example.com", attributesMock);

        Assert.assertNotNull(element);
        Assert.assertEquals(tagMock, element.tag());
        Assert.assertEquals("http://example.com", element.baseUri());
        Assert.assertEquals(attributesMock, element.attributes());
    }

    @Test
    public void ElementTagUriConstructorTest() {
        Tag tagMock = mock(Tag.class);
        Element element = new Element(tagMock, "http://example.com");

        Assert.assertNotNull(element);
        Assert.assertEquals(tagMock, element.tag());
        Assert.assertEquals("http://example.com", element.baseUri());
    }

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        Assert.assertEquals("div", element.tagName());
    }

    @Test
    public void tagNameChangeTest() {
        Element element = new Element("div");
        element.tagName("span");
        Assert.assertEquals("span", element.tagName());
    }

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("id", "myId");
        Assert.assertEquals("myId", element.attr("id"));
    }

    @Test
    public void attrBooleanTest() {
        Element element = new Element("div");
        element.attr("hidden", true);
        Assert.assertEquals("true", element.attr("hidden"));
    }

    @Test
    public void childTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);

        Assert.assertEquals(child, parent.child(0));
    }

    @Test
    public void parentsTest() {
        Element parent = new Element("div");
        Element child = parent.appendElement("span");
        Elements parents = child.parents();

        Assert.assertEquals(1, parents.size());
        Assert.assertEquals(parent, parents.get(0));
    }

    @Test
    public void selectTest() {
        Element parent = new Element("div");
        parent.appendChild(new Element("span"));
        parent.appendChild(new Element("span"));

        Elements selected = parent.select("span");

        Assert.assertEquals(2, selected.size());
    }

    @Test
    public void selectFirstTest() {
        Element parent = new Element("div");
        parent.appendChild(new Element("span"));
        parent.appendChild(new Element("span"));

        Element selected = parent.selectFirst("span");

        Assert.assertNotNull(selected);
    }

    @Test
    public void prependChildTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        parent.prependChild(child2);

        Assert.assertEquals(child2, parent.child(0));
    }

    @Test
    public void appendToTest() {
        Element parent = new Element("div");
        Element child = new Element("span");

        child.appendTo(parent);

        Assert.assertEquals(child, parent.child(0));
    }

    @Test
    public void siblingsTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        parent.appendChild(child2);

        Assert.assertEquals(1, child1.siblingElements().size());
        Assert.assertEquals(child2, child1.siblingElements().get(0));
    }

    @Test
    public void nextElementSiblingTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        parent.appendChild(child2);

        Assert.assertEquals(child2, child1.nextElementSibling());
    }

    @Test
    public void previousElementSiblingTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        parent.appendChild(child2);

        Assert.assertEquals(child1, child2.previousElementSibling());
    }

    @Test
    public void removeClassTest() {
        Element element = new Element("div");
        element.attr("class", "myClass");
        Assert.assertTrue(element.hasClass("myClass"));

        element.removeClass("myClass");
        Assert.assertFalse(element.hasClass("myClass"));
    }

    @Test
    public void toggleClassTest() {
        Element element = new Element("div");
        element.attr("class", "myClass");

        element.toggleClass("myClass");
        Assert.assertFalse(element.hasClass("myClass"));

        element.toggleClass("myClass");
        Assert.assertTrue(element.hasClass("myClass"));
    }

    @Test
    public void valTest() {
        Element element = new Element("input");
        element.val("my value");
        Assert.assertEquals("my value", element.val());
    }

}