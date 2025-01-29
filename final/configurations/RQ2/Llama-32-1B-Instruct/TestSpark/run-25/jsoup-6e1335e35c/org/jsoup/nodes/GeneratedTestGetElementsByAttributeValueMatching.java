package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByAttributeValueMatching {

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByAttributeValueMatching works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttributeValue("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttributeValue("class")); // Should print ""
    }

}