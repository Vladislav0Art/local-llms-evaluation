package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeTraversal {

    @Test
    public void testNodeTraversal() {
        NodeList nodeList = new NodeList();
        nodeList.addElement("Hello");
        nodeList.addElement("World");
        nodeList.addElement("Java");
        for (Object element : nodeList) {
            System.out.println(element);
        }
    }

}