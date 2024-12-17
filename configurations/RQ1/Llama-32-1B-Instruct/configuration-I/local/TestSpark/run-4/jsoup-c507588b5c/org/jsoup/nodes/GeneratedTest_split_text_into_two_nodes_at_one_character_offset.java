package org.jsoup.nodes;

public class GeneratedTest_split_text_into_two_nodes_at_one_character_offset {

    @Test
    public void test_split_text_into_two_nodes_at_one_character_offset() {
        // Arrange
        String text = "hello";
        int offset = 1;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals("hel", result.text());
    }

}