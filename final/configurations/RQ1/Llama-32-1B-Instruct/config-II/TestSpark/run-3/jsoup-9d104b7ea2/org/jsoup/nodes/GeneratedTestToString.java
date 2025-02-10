package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        // Act
        String result = TextNode.toString();

        // Assert
        assertTrue(result.contains("<p>"), "Expected a paragraph-like output.");
    }

}