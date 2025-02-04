package org.jsoup.nodes;

public class GeneratedNewNodeTextCreatedFromEncodedWithNewlinesTest {

    @Test
    public void newNodeTextCreatedFromEncodedWithNewlinesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with newline&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with newline ", node.text());
    }

}