package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeStarting {

    @Test
    public void testGetElementsByAttributeStarting() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeStarting works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttribute("type")); // Should print "text"
    }

}