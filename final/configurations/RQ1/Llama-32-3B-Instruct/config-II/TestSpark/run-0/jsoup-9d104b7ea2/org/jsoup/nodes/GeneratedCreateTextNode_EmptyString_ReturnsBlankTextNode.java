package org.jsoup.nodes;

public class GeneratedCreateTextNode_EmptyString_ReturnsBlankTextNode {

    @Test
    public void createTextNode_EmptyString_ReturnsBlankTextNode() {
        // Given
        String text = "";
        TextNode textNode = new TextNode(text);

        // Then
        assertTrue(textNode.isBlank());
    }

}