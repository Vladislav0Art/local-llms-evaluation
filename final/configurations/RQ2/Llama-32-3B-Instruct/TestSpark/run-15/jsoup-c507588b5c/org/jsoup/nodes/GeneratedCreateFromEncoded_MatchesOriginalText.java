package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_MatchesOriginalText {

    @Test
    public void createFromEncoded_MatchesOriginalText() throws IOException {
        // Arrange
        String encodedText = "text";
        TextNode node = TextNode.createFromEncoded(encodedText);

        // Act & Assert
        assertEquals(node, new TextNode(encodedText));
    }

}