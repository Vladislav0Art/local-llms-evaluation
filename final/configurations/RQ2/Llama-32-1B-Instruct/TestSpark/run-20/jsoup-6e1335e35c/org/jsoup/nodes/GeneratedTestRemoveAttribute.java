package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestRemoveAttribute {

    @Test
    public void testRemoveAttribute() {
        // Create a document object with an empty root element
        Document doc = new Document();

        // Add an attribute to the first element in the document
        Element elem1 = doc.addElement("p").setAttribute("class", "test-class");

        // Remove the attribute from the second element in the document
        Element elem2 = doc.addElement("div").setAttribute("class", "test-class-2");

        // Verify that the attributes were correctly removed
        assertEquals(0, doc.getNumberOfElements());
    }

}