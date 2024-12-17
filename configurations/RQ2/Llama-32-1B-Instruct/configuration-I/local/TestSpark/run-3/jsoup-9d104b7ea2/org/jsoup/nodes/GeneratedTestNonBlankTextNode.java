package org.jsoup.nodes;

public class GeneratedTestNonBlankTextNode {

    private MockTextNode mockTextNode;

    @Test
    public void testNonBlankTextNode() {
        // Given
        String input = "Hello World";

        // When
        TextNode result = mockTextNode.getText();

        // Then
        assertNotNull(result);
        assertTrue(!result.isBlank());
    }

}