package org.jsoup.nodes;

public class GeneratedTestSplitText_MultipleWhitespace {

    @Test
    public void testSplitText_MultipleWhitespace() {
        // Arrange
        String text = "hello   world";
        int offset = 6;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertTrue(result.value().trim().isEmpty(), "Expected splitText(6) to return an empty string");
    }

}