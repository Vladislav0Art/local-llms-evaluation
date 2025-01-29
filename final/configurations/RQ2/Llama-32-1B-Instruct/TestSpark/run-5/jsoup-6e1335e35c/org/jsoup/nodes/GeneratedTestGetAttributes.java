package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAttributes {

    @Test
    public void testGetAttributes() {
        // Create node with no attributes
        Node node1 = new Root();
        node1.setAttribute("type", "A");
        node1.setAttribute("size", 10);

        // Set text on the node
        node1.setText("Node");

        // Get attributes of a node
        String[] attributes = node1.getAttributes();

        // Check if attributes are correct
        assertTrue(attributes.length == 2);
        assertTrue(attributes[0].contains("type"));
        assertTrue(attributes[1].contains("size"));

        // Set text on the node again to verify it gets updated correctly
        node1.setText("Node Again");

        // Get attributes of a node
        attributes = node1.getAttributes();

        // Check if attributes are correct
        assertTrue(attributes.length == 2);
        assertTrue(attributes[0].contains("type"));
        assertTrue(attributes[1].contains("size"));
    }

}