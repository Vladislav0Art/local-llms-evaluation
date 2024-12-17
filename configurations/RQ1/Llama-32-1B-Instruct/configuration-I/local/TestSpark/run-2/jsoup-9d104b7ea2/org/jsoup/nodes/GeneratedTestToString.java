package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode textNode = new MockTextNode();
        textNode.text("Hello, World!");
        String expectedValue = "<!DOCTYPE html><html><body>Hello, World!</body></html>";
        assertEquals(expectedValue, textNode.toString());
    }

}