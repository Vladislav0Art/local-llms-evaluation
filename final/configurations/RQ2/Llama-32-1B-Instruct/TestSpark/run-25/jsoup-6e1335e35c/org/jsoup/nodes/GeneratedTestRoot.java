package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestRoot {

    @Test
    public void testRoot() {
        Node node = new Node();
        // Test that root can be accessed directly and indirectly
        System.out.println(node.root()); // Should return itself

        // Check if traverse method returns the root
        Node result = node.traverse(null);
        if (result == node) { // Because traverse should return the root
            System.out.println("Traversed to the root correctly");
        }
    }

}