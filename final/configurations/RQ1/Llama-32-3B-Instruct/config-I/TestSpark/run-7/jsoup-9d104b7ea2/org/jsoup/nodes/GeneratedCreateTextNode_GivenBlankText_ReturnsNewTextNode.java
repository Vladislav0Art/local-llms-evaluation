package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenBlankText_ReturnsNewTextNode {

    @Test
    public void createTextNode_GivenBlankText_ReturnsNewTextNode() {
        // Given
        String text = "";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertNotNull(textNode);
        assertEquals("text", textNode.nodeName());
        assertTrue(textNode.isBlank());
    }

}