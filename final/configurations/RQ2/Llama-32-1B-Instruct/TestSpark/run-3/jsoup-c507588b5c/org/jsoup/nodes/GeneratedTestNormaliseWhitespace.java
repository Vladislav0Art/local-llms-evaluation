package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        // Arrange
        String text = NORMALIZED_whitespace;
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode textNode = new TextNode(text);
        assertEquals(NORMALIZED_whitespace, textNode.text());

        // Assert
        assertNotNull(textNode.nodeName());
    }

}