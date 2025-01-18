package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedTextNodesTest {

    @Test
    public void textNodesTest() {
        Element element = new Element("p");
        TextNode textNode = new TextNode("Hello, world!");
        element.appendChild(textNode);
        Assert.assertEquals(1, element.textNodes().size());
        Assert.assertEquals(textNode, element.textNodes().get(0));
    }

}