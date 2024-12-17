package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Test that isBlank returns true if this document is empty or only whitespace
        TextNode doc = new TextNode("");
        assertTrue(doc.isBlank());

        // Test that isBlank returns false if it contains any text content
        TextNode doc2 = new TextNode("Hello World");
        assertFalse(doc2.isBlank());
    }

}