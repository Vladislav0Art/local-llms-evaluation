package org.jsoup.nodes;

public class GeneratedCloneCreatesNewTextNodeWithSameText {

    @Test
    public void cloneCreatesNewTextNodeWithSameText() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // When
        TextNode clonedTextNode = textNode.clone();

        // Then
        assertEquals(text, clonedTextNode.text());
    }

}