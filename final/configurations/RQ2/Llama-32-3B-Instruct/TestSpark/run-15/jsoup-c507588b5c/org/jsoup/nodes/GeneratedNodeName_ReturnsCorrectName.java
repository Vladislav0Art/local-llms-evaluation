package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectName {

    @Test
    public void nodeName_ReturnsCorrectName() {
        // Arrange & Act
        TextNode node = new TextNode("test");
        String nodeName = node.nodeName();

        // Assert
        assertEquals("text", nodeName);
    }

}