package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testBlankText() {
        // Arrange
        String text = "   ";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertThat(result, is(false));
    }

    @Test
    public void testSingleLineEmptyText() {
        // Arrange
        String text = "";

        // Act
        String result = TextNode.text(text);

        // Assert
        assertThat(result, is(""));
    }

    @Test
    public void testEmptyString() {
        // Arrange
        String text = null;

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertThat(result, is(true));
    }

    @Test
    public void testSplitTextSingleLine() {
        // Arrange
        String text = "   ";

        // Act
        TextNode result = TextNode.splitText(0);
        assertThat(result.text(), is("   "));
    }

    @Test
    public void testSplitTextMultipleLines() {
        // Arrange
        String text = "Hello\nWorld";

        // Act
        TextNode result = TextNode.splitText(7);
        assertThat(result.text(), is("Hello World"));
    }

    @Test
    public void testSplitTextBlankText() {
        // Arrange
        String text = "";

        // Act
        TextNode result = TextNode.splitText(0);
        assertThat(result.text(), is(""));
    }

    @Test
    public void testSplitTextEmptyString() {
        // Arrange
        String text = "   ";

        // Act
        TextNode result = TextNode.splitText(5);
        assertThat(result.text(), is("   "));
    }

    @Test
    public void testSplitTextSingleLineBlankText() {
        // Arrange
        String text = "";

        // Act
        TextNode result = TextNode.splitText(0);
        assertThat(result.text(), is(""));
    }

    @Test
    public void testSplitTextMultipleLinesBlankText() {
        // Arrange
        String text = "Hello\n";

        // Act
        TextNode result = TextNode.splitText(4);
        assertThat(result.text(), is("Hello"));
    }

    @Test
    public void testTrimLeadingWhitespace() {
        // Arrange
        String text = "   ";

        // Act
        String result = TextNode.stripLeadingWhitespace(text);

        // Assert
        assertThat(result, is(""));
    }

    @Test
    public void testTrimTrailingWhitespace() {
        // Arrange
        String text = "   World";

        // Act
        String result = TextNode.stripLeadingWhitespace(text);
        assertThat(result, is("World"));
    }

}