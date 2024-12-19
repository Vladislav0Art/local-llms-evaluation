package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        // Arrange & Act
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // Assert
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
        assertEquals(text, textNode.text());
    }

}