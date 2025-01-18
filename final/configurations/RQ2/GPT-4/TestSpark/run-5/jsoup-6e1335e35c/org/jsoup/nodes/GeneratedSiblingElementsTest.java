package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedSiblingElementsTest {

    @Test
    public void siblingElementsTest() {
        Element parent = new Element("div");
        Element firstChild = new Element("p");
        Element secondChild = new Element("span");
        parent.appendChild(firstChild);
        parent.appendChild(secondChild);
        Elements siblings = firstChild.siblingElements();
        Assert.assertEquals(1, siblings.size());
        Assert.assertEquals(secondChild, siblings.get(0));
    }

}