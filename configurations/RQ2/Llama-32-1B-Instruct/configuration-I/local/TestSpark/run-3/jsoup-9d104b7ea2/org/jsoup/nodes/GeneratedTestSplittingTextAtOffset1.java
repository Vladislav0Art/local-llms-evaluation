package org.jsoup.nodes;

public class GeneratedTestSplittingTextAtOffset1 {

    private MockTextNode mockTextNode;

    @Test
    public void testSplittingTextAtOffset1() {
        // Given
        String input = "HelloWorld";
        int offset = 4;

        // When
        TextNode result1 = mockTextNode.splitText(offset);
        TextNode result2 = mockTextNode.splitText(0);

        // Then
        assertNotNull(result1);
        assertEquals("Hello", result1.text());
        assertTrue(result2.isBlank());
    }

}