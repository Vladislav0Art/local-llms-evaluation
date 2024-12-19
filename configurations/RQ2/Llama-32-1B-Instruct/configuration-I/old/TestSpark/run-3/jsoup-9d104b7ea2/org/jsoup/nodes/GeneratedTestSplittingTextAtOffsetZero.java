package org.jsoup.nodes;

public class GeneratedTestSplittingTextAtOffsetZero {

    private MockTextNode mockTextNode;

    @Test
    public void testSplittingTextAtOffsetZero() {
        // Given
        String input = "World";

        // When
        TextNode result = mockTextNode.splitText(0);

        // Then
        assertNotNull(result);
        assertEquals("", result.text());
    }

}