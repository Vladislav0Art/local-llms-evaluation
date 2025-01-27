package org.jsoup.nodes;

public class GeneratedClone_TextNode_ReturnsClone {

    @Test
    public void clone_TextNode_ReturnsClone() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        TextNode clone = textNode.clone();

        // Then
        assertNotNull(clone);
        assertEquals(textNode, clone);
    }

}