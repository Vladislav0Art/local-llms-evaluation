package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.SerializationException;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorWithTagTest() {
        // Prepare
        Tag inputTag = Tag.valueOf("p");

        // Act
        Element element = new Element(inputTag, "");

        // Assert
        Assert.assertNotNull(element);
        Assert.assertEquals(inputTag, element.tag());
    }

    @Test
    public void hasChildNodesTest() {
        // Prepare
        Element element = new Element("p");

        // Act and Assert
        Assert.assertFalse(element.hasChildNodes());
    }

    @Test
    public void ensureChildNodesTest() {
        // Prepare
        Element element = new Element("p");

        // Act
        List<Node> nodes = element.ensureChildNodes();

        // Assert
        Assert.assertNotNull(nodes);
    }

    @Test
    public void hasAttributesTest() {
        // Prepare
        Element element = new Element("p");

        // Act and Assert
        Assert.assertFalse(element.hasAttributes());
    }

    @Test
    public void baseUriTest() {
        // Prepare
        String baseUri = "http://localhost";
        Element element = new Element(Tag.valueOf("p"), baseUri);

        // Act and Assert
        Assert.assertEquals(baseUri, element.baseUri());
    }

    @Test
    public void nodeNameTest() {
        // Prepare
        String nodeName = "link";
        Element element = new Element(Tag.valueOf(nodeName), "");

        // Act and Assert
        Assert.assertEquals(nodeName, element.nodeName());
    }

    @Test
    public void appendChildTest() {
        // Prepare
        Element element = new Element("p");
        Element child = new Element("div");

        // Act
        element.appendChild(child);

        // Assert
        Assert.assertEquals(1, element.children().size());
        Assert.assertEquals(child, element.child(0));
    }

    @Test
    public void textTest() {
        // Prepare
        Element element = new Element("p").text("Test");

        // Act and Assert
        Assert.assertEquals("Test", element.text());
    }

    @Test
    public void attrTest() {
        // Prepare
        Element element = new Element("p");

        // Act
        element.attr("testAttr", "testValue");

        // Assert
        Assert.assertEquals("testValue", element.attr("testAttr"));
    }

    @Test
    public void selectTest() {
        // Prepare
        Element element = new Element("p").attr("testAttr", "testValue");

        // Act
        Elements elements = element.select("[testAttr=testValue]");

        // Assert
        Assert.assertEquals(1, elements.size());
        Assert.assertEquals(element, elements.get(0));
    }

    @Test
    public void selectFirstTest() {
        // Prepare
        Element element = new Element("p").attr("testAttr", "testValue");

        // Act
        Element firstElement = element.selectFirst("[testAttr=testValue]");

        // Assert
        Assert.assertEquals(element, firstElement);
    }

}