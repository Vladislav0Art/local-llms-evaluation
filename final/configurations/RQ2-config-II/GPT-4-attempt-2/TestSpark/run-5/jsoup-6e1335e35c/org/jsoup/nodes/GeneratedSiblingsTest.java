package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedSiblingsTest {

    @Test
    public void siblingsTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Elements siblingsOfChild1 = child1.siblingElements();
        Assert.assertEquals(children, siblingsOfChild1);
    }

}