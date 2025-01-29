package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetChildren {

    @Test
    public void testGetChildren() {
        // Create root node with no children
        Node root = new Root();

        // Add child nodes to the root
        ChildNode child1 = new ChildNode("child1", 10);
        ChildNode child2 = new ChildNode("child2", 20);

        // Set attributes on the children
        child1.setAttribute("type", "A");
        child2.setAttribute("size", "large");

        // Get children of a node
        ChildNode[] children = root.getChildren();

        // Check if children are correct
        assertTrue(children.length == 2);
        assertTrue(children[0].contains("child1"));
        assertTrue(children[1].contains("child2"));

        // Add child nodes again to verify they get updated correctly
        ChildNode newChild1 = new ChildNode("newChild1", 30);
        ChildNode newChild2 = new ChildNode("newChild2", 40);

        // Set attributes on the children again
        newChild1.setAttribute("type", "B");
        newChild2.setAttribute("size", "small");

        // Get children of a node again to verify they get updated correctly
        children = root.getChildren();
    }

}