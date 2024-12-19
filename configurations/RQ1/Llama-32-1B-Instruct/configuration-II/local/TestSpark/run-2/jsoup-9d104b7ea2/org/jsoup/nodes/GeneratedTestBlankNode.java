package org.jsoup.nodes;

public class GeneratedTestBlankNode {

    @Test
    public void testBlankNode() {
        // Given
        Node node = new TextNode("");

        // When
        boolean result = node.isBlank();

        // Then
        Assert.assertTrue(result);
    }

}