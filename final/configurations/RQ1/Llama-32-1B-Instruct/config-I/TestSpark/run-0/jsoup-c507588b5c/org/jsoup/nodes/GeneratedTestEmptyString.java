package org.jsoup.nodes;

public class GeneratedTestEmptyString {

    @Test
    public void testEmptyString() {
        // Arrange
        String text = null;

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertThat(result, is(true));
    }

}