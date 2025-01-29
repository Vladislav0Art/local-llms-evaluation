package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeRoot {

    @Test
    public void testNodeRoot() {
        NodeList nodeList = new NodeList();
        nodeList.addElement("Hello");
        nodeList.addElement("World");
        nodeList.addElement("Java");
        assertEquals("Hello", nodeList.root().text());
    }

}