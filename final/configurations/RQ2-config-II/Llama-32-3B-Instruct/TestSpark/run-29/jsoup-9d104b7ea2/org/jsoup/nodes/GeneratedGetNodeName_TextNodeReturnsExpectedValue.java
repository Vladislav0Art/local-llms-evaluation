package org.jsoup.nodes;

public class GeneratedGetNodeName_TextNodeReturnsExpectedValue {

    @Test
    public void getNodeName_TextNodeReturnsExpectedValue() {
        // Arrange
        TextNode node = new TextNode("test");

        // Act
        String actual = node.nodeName();

        // Assert
        assertEquals("text", actual);
    }

}