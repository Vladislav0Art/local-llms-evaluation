package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetClassNames {

    @Test
    public void testGetClassNames() {
        // Create root node
        Node root = new Root();

        // Add child nodes
        ChildNode child1 = new ChildNode("child1", 10);
        ChildNode child2 = new ChildNode("child2", 20);

        // Set attributes on the children
        child1.setAttribute("type", "A");
        child2.setAttribute("size", "large");

        // Set text on the root node
        root.setText("Root");

        // Get class names of all nodes in the tree
        String[] classNames = root.getClassNames();

        // Check if class names are correct
        for (String className : classNames) {
            assertTrue(className.contains("child1"));
            assertTrue(className.contains("child2"));
        }

        // Set text on a node
        root.setText("New Root");

        // Get class names of all nodes in the tree
        classNames = root.getClassNames();

        // Check if class names are correct
        for (String className : classNames) {
            assertTrue(className.contains("root"));
        }
    }

}