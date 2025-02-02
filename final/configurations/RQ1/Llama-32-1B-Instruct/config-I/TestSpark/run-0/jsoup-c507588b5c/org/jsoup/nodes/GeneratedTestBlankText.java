package org.jsoup.nodes;

public class GeneratedTestBlankText {

    @Test
    public void testBlankText() {
        // Arrange
        String text = "   ";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertThat(result, is(false));
    }

}