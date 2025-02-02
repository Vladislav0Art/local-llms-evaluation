package org.jsoup.nodes;

public class GeneratedTestTrimLeadingWhitespace {

    @Test
    public void testTrimLeadingWhitespace() {
        // Arrange
        String text = "   ";

        // Act
        String result = TextNode.stripLeadingWhitespace(text);

        // Assert
        assertThat(result, is(""));
    }

}