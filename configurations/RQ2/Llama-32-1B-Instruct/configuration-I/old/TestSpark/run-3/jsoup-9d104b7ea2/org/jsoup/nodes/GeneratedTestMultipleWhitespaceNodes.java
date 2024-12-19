package org.jsoup.nodes;

public class GeneratedTestMultipleWhitespaceNodes {

    private MockTextNode mockTextNode;

    @Test
    public void testMultipleWhitespaceNodes() {
        // Given
        String input = "   \n  ";

        // When
        TextNode result = mockTextNode.getText();

        // Then
        assertEquals("   \n", result.text());
    }

}