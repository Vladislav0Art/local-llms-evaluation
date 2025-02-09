package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        int numOfChildrenNodes = parent.childNodeSize();
        assertEquals(2, numOfChildrenNodes);
    }

}