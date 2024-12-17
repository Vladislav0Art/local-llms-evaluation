package org.jsoup.nodes;

public class GeneratedTest_split_text_at_zero_offset {

    @Test
    public void test_split_text_at_zero_offset() {
        // Arrange
        String text = "";
        int offset = 0;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals("", result.text());
    }

}