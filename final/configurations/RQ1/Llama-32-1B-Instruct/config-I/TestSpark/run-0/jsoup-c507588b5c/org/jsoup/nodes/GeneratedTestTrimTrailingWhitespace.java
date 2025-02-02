package org.jsoup.nodes;

public class GeneratedTestTrimTrailingWhitespace {

    @Test
    public void testTrimTrailingWhitespace() {
        // Arrange
        String text = "   World";

        // Act
        String result = TextNode.stripLeadingWhitespace(text);
        assertThat(result, is("World"));
    }

}