package org.jsoup.nodes;

public class GeneratedNewNodeTextCreatedFromEncodedWithMultipleSpacesTest {

    @Test
    public void newNodeTextCreatedFromEncodedWithMultipleSpacesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with multiple spaces&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with multiple spaces ", node.text());
    }

}