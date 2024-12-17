package org.jsoup.nodes;

public class GeneratedTest_split_text_into_three_nodes_at_zero_offset {

    @Test
    public void test_split_text_into_three_nodes_at_zero_offset() {
        // Arrange
        String text = "";

        // Act
        TextNode result = TextNode.splitText(0);

        // Assert
        assertEquals("", result.text());
    }

}