package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetText {

    @Test
    public void testGetText() {
        // Create root node with no text
        Node root = new Root();

        // Add child nodes to the root
        ChildNode child1 = new ChildNode("child1", 10);
        ChildNode child2 = new ChildNode("child2", 20);

        // Set attributes on the children
        child1.setAttribute("type", "A");
        child2.setAttribute("size", "large");

        // Get text of a node
        String text = root.getText();

        // Check if text is correct
        assertTrue(text.contains("Root"));
    }

}