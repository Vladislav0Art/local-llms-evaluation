package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("class");
        Element childElement = new Element("child");
        element.appendChild(childElement);
        Assert.assertEquals(1, element.childNodeSize());
    }

}