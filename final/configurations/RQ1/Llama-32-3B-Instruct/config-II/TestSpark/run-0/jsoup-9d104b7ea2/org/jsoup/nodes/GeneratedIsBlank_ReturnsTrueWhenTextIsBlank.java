package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueWhenTextIsBlank {

    @Test
    public void isBlank_ReturnsTrueWhenTextIsBlank() {
        // Given
        String text = "";
        TextNode textNode = new TextNode(text);

        // Then
        assertTrue(textNode.isBlank());
    }

}