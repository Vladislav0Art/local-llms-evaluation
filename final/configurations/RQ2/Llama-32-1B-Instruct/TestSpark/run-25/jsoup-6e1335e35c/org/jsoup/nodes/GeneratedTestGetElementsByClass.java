package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetElementsByClass {

    @Test
    public void testGetElementsByClass() {
        Node node = new Node();
        node.addAttr("id", "test");
        node.addClass("test-class");

        // Check if getElementsByClass works as expected
        Element element1 = node.getByTag("input");
        System.out.println(element1.getAttribute("class")); // Should print "test-class"

        Element element2 = node.getByTag("button");
        System.out.println(element2.getAttribute("class")); // Should print ""
    }

}