package org.jsoup.nodes;

public class GeneratedClone_CreatesDeepCopy {

    @Test
    public void clone_CreatesDeepCopy() {
        // Given
        TextNode node = new TextNode("Hello World");

        // When
        TextNode result = node.clone();

        // Then
        assertNotNull(result);
        assertEquals(node.text(), result.text());
    }

}