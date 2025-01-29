package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAddElement {

    @Test
    public void testAddElement() {
        // Create a document object with an empty root element
        Document doc = new Document();

        // Add an element to the document
        Element elem = doc.addElement("div");

        // Verify that the element was added successfully
        assertEquals(1, doc.getNumberOfElements());
    }

}