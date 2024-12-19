package org.jsoup.nodes;

public class GeneratedTestSingleWhitespaceNode {

    private MockTextNode mockTextNode;

    @Test
    public void testSingleWhitespaceNode() {
        // Given
        String input = "  ";

        // When
        TextNode result = mockTextNode.getText();

        // Then
        assertEquals(input, result.text());
    }

}