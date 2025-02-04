package org.jsoup.nodes;

public class GeneratedNewNodeTextCreatedFromEncodedWithNewlinesAndSpacesTest {

    @Test
    public void newNodeTextCreatedFromEncodedWithNewlinesAndSpacesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with newline and spaces&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with newline and spaces ", node.text());
    }

}