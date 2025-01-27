package org.jsoup.nodes;

public class GeneratedIsBlank_TextNode_ReturnsTrueIfTextIsBlank {

    @Test
    public void isBlank_TextNode_ReturnsTrueIfTextIsBlank() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean isBlank = textNode.isBlank();

        // Then
        assertTrue(isBlank);
    }

}