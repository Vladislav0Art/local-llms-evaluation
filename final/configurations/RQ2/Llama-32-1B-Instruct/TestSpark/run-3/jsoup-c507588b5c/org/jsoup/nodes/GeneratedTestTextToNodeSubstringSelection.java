package org.jsoup.nodes;

public class GeneratedTestTextToNodeSubstringSelection {

    @Test
    public void testTextToNodeSubstringSelection() {
        // Arrange
        String text = "Hello, World! 123";
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode textNode = new TextNode(text);
        String result1 = textNode.substring(0, 5);
        String result2 = textNode.substring(10, 15);

        // Assert
        assertEquals("Hello", result1);
        assertEquals("", result2);
    }

}