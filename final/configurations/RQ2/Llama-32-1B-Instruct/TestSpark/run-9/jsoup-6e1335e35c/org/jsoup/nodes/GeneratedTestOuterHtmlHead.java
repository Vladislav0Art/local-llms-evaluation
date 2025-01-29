package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        // Create a sample document
        Document doc = new Document();
        doc.addTag(new Tag("div", "Hello World"));

        // Add outer HTML head
        doc.outerHtmlHead(null, 0, null);

        // Check if the head element is generated correctly
        assertEquals(doc, doc.outerHtmlTail(doc.outerHtmlTail(doc.outerHtmlTail(doc.outerHtmlHead(null, 0, null))));
    }

}