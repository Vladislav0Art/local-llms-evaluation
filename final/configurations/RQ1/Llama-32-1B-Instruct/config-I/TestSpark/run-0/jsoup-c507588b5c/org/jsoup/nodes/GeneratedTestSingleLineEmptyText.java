package org.jsoup.nodes;

public class GeneratedTestSingleLineEmptyText {

    @Test
    public void testSingleLineEmptyText() {
        // Arrange
        String text = "";

        // Act
        String result = TextNode.text(text);

        // Assert
        assertThat(result, is(""));
    }

}