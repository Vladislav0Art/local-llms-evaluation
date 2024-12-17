package org.jsoup.nodes;

public class GeneratedTest_split_text_into_two_nodes_at_two_characters_offset {

    @Test
    public void test_split_text_into_two_nodes_at_two_characters_offset() {
        // Arrange
        String text = "hello";
        int offset = 2;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals("he", result.text());
    }

}