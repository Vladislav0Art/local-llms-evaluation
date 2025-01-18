package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedChildrenSizeTest {

    @Test
    public void childrenSizeTest() {
        Element parent = new Element("div");
        parent.appendChild(new Element("p"));
        parent.appendChild(new Element("span"));
        Assert.assertEquals(2, parent.childrenSize());
    }

}