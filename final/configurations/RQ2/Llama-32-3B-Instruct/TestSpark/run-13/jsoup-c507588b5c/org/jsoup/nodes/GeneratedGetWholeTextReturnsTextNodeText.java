package org.jsoup.nodes;

public class GeneratedGetWholeTextReturnsTextNodeText {

    @Test
    public void getWholeTextReturnsTextNodeText() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertEquals(text, wholeText);
    }

}