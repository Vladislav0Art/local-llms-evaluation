package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestFilter {

    @Test
    public void testFilter() {
        Node node = new Node();
        node.addAttr("attr1", "value1");
        node.addAttr("attr2", "value2");

        // Check if filter method works as expected
        String filtered = node.filter(null);
        System.out.println(filtered); // Should print "value2"

        // Check if we can filter nodes based on the given criteria
        Node filteredNode = node.filter("attr1");
        if (filteredNode != null) {
            System.out.println(filteredNode.getAttribute("attr1")); // Should return "value1"
        } else {
            System.out.println("No node matches this condition");
        }
    }

}