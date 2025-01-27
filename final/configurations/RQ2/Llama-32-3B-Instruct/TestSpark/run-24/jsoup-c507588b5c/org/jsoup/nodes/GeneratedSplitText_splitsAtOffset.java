package org.jsoup.nodes;

public class GeneratedSplitText_splitsAtOffset {

    @Test
    public void splitText_splitsAtOffset() {
        // Given
        TextNode node = new TextNode("Hello World");
        int offset = 6;

        // When
        TextNode result = node.splitText(offset);

        // Then
        assertNotNull(result);
        assertEquals(5, result.text().length());
    }

}