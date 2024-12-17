package org.jsoup.nodes;

public class GeneratedTest_clone_with_empty_string {

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