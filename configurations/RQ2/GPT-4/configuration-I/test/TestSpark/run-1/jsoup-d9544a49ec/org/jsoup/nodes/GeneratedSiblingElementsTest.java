package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSiblingElementsTest {

    @Test
    public void siblingElementsTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("tag1");
        Element child2 = new Element("tag2");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Elements siblings = child1.siblingElements();
        assertTrue(siblings.contains(child2));
    }

}