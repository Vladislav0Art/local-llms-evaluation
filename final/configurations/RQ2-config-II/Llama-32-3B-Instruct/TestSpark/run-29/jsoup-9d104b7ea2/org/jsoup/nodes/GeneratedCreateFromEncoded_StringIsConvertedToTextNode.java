package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_StringIsConvertedToTextNode {

    @Test
    public void createFromEncoded_StringIsConvertedToTextNode() {
        // Arrange
        String encodedText = "text";
        TextNode node = TextNode.createFromEncoded(encodedText);

        // Act

        // Assert
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}