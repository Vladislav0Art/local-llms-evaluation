package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenValidText_ReturnsNewTextNode {

    @Test
    public void createTextNode_GivenValidText_ReturnsNewTextNode() {
        // Given
        String text = "Hello World";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertNotNull(textNode);
        assertEquals("text", textNode.nodeName());
        assertEquals(text, textNode.text());
    }

}