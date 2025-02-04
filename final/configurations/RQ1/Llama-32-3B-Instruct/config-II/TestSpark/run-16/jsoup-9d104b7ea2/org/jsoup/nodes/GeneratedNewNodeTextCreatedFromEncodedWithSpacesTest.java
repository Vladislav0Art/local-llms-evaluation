package org.jsoup.nodes;

public class GeneratedNewNodeTextCreatedFromEncodedWithSpacesTest {

    @Test
    public void newNodeTextCreatedFromEncodedWithSpacesTest() {
        // Arrange
        String encodedText = "<a>&lt;test with spaces&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals(" test with spaces ", node.text());
    }

}