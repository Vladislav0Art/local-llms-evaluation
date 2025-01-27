package org.jsoup.nodes;

public class GeneratedIsBlankReturnsTrueForEmptyTextNode {

    @Test
    public void isBlankReturnsTrueForEmptyTextNode() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean isEmpty = textNode.isBlank();

        // Then
        assertTrue(isEmpty);
    }

}