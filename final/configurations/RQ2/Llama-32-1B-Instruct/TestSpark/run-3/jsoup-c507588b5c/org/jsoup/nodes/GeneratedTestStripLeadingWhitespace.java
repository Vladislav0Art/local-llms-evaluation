package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    @Test
    public void testStripLeadingWhitespace() {
        // Arrange
        String text = STRIPPED_LEADING_WHITESPACE;
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode textNode = new TextNode(text);
        assertEquals(STRIPPED_LEADING_WHITESPACE, textNode.text());

        // Assert
        assertNotNull(textNode.nodeName());
    }

}