package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() {
        // Arrange
        String encodedText = "Hello World!";
        TextNode node = org.jsoup.nodes.TextNode.createFromEncoded(encodedText);

        // Act and Assert
        assertEquals("Hello World!", node.text());
    }

}