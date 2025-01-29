package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestShallowClone {

    @Test
    public void testShallowClone() {
        // Create a sample document
        Document doc = new Document();
        doc.addTag(new Tag("div", "Hello World"));

        // Clone the document
        CustomElement clone = (CustomElement) doc.shallowClone();

        // Check if the cloned element is identical to the original element
        assertEquals(doc, clone);
    }

}