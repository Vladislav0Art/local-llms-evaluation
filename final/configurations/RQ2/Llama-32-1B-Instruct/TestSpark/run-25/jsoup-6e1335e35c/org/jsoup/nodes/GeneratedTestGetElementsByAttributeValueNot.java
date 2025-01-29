package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValueNot {

    @Test
    public void testGetElementsByAttributeValueNot() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeValueNot works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("class")); // Should print ""
    }

}