package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedNextElementSiblingTest {

    @Test
    public void nextElementSiblingTest() {
        Element parent = new Element("div");
        Element firstChild = new Element("p");
        Element secondChild = new Element("span");
        parent.appendChild(firstChild);
        parent.appendChild(secondChild);
        Assert.assertEquals(secondChild, firstChild.nextElementSibling());
    }

}