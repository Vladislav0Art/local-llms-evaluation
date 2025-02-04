package org.jsoup.nodes;

public class GeneratedNewNodeTextCreatedFromEncodedTest {

    @Test
    public void newNodeTextCreatedFromEncodedTest() {
        // Arrange
        String encodedText = "<a>&lt;test&gt;</a>";
        TextNode node = new TextNode(TextNode.createFromEncoded(encodedText));

        // Act & Assert
        assertEquals("test", node.text());
    }

}