package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByTag {

    @Test
    public void testGetElementsByTag() {
        Node node = new Node();
        node.addAttr("id", "test");

        // Check if getElementsByTag works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttribute("type")); // Should print "text"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttribute("class")); // Should print "test"
    }

}