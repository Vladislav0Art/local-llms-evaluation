package org.jsoup.nodes;

public class GeneratedIsBlankReturnsFalseForNonEmptyTextNode {

    @Test
    public void isBlankReturnsFalseForNonEmptyTextNode() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // When
        boolean isEmpty = textNode.isBlank();

        // Then
        assertFalse(isEmpty);
    }

}