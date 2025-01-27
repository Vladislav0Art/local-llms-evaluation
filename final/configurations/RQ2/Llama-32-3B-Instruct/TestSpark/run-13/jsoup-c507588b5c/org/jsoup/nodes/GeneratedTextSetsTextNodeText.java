package org.jsoup.nodes;

public class GeneratedTextSetsTextNodeText {

    @Test
    public void textSetsTextNodeText() {
        // Given
        TextNode textNode = new TextNode();
        String newText = "New Text";
        textNode.text(newText);

        // When
        String textValue = textNode.text();

        // Then
        assertEquals(newText, textValue);
    }

}