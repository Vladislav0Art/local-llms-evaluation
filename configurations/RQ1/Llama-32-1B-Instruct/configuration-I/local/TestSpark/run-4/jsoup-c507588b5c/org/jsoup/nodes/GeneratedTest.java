package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void test_blank_node() {
        // Arrange
        String text = "";

        // Act
        boolean result = TextNode.isBlank();

        // Assert
        assertTrue(result);
    }

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

    @Test
    public void test_split_text_at_one_character_offset() {
        // Arrange
        String text = "hello";
        int offset = 1;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals("hello", result.text());
    }

    @Test
    public void test_split_text_into_two_nodes_at_zero_offset() {
        // Arrange
        String text = "";
        int offset = 0;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals("", result.text());
    }

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

    @Test
    public void test_split_text_into_three_nodes_at_zero_offset() {
        // Arrange
        String text = "";

        // Act
        TextNode result = TextNode.splitText(0);

        // Assert
        assertEquals("", result.text());
    }

    @Test
    public void test_clone_with_empty_string() {
        // Arrange
        String text = "";

        // Act
        TextNode result = TextNode.clone();

        // Assert
        assertEquals(text, result.value);
    }

}