package org.jsoup.nodes;

public class GeneratedTestBlankNode {

    private MockTextNode mockTextNode;

    @Test
    public void testBlankNode() {
        // Given
        String input = "   ";

        // When
        boolean result = mockTextNode.isBlank();

        // Then
        assertTrue(result);
    }

}