package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeFilter {

    @Test
    public void testNodeFilter() {
        NodeList nodeList = new NodeList();
        nodeList.addElement("Hello");
        nodeList.addElement("World");
        nodeList.addElement("Java");
        nodeList.filter((node, index) -> node.contains("W")); // filter out elements containing "W"
        for (Object element : nodeList) {
            System.out.println(element);
        }
    }

}