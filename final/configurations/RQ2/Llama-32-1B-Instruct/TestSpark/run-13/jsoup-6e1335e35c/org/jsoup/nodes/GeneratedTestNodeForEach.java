package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeForEach {

    @Test
    public void testNodeForEach() {
        NodeList nodeList = new NodeList();
        nodeList.addElement("Hello");
        nodeList.addElement("World");
        nodeList.addElement("Java");
        nodeList.forEach(node -> System.out.println(node));
    }

}