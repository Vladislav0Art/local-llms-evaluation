package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void isBlank_thenReturnTrue_whenTextIsBlank() {
        // Arrange
        String text = "";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result);
    }

    @Test
    public void splitText_thenReturnTextAfterOffset() {
        // Arrange
        String text = "Hello World";
        int offset = 5;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals("Hello World", result.text());
    }

    @Test
    public void outerHtmlHead_thenReturnEmptyString() {
        // Arrange
        String text = "";

        // Act
        StringBuilder result = new StringBuilder();
        TextNode test = new TextNode(text);

        test.outerHtmlHead(result, 0, null).append("\n");

        // Assert
        assertEquals("", result.toString());
    }

    @Test
    public void outerHtmlTail_thenReturnEmptyString() {
        // Arrange
        String text = "";

        // Act
        StringBuilder result = new StringBuilder();
        TextNode test = new TextNode(text);

        test.outerHtmlTail(result, 0, null).append("\n");

        // Assert
        assertEquals("", result.toString());
    }

    @Test
    public void toString_thenReturnText() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.text());
    }

    @Test
    public void clone_thenReturnClone() {
        // Arrange
        TextNode text = new TextNode("Hello World");

        // Act
        TextNode clonedText = (TextNode) text.clone();

        // Assert
        assertEquals(text, clonedText);
    }

    @Test
    public void createFromEncoded_thenReturnEncodableText() {
        // Arrange
        String encodedText = "&lt;Hello&gt;";

        // Act
        TextNode result = TextNode.createFromEncoded(encodedText);

        // Assert
        assertEquals("&lt;Hello&gt;", result.text());
    }

    @Test
    public void normaliseWhitespace_thenReturnUnencodedText() {
        // Arrange
        String text = "Hello World";

        // Act
        String result = TextNode.normaliseWhitespace(text);

        // Assert
        assertEquals("Hello World", result);
    }

    @Test
    public void stripLeadingWhitespace_thenReturnTruncatedString() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello  ");

        // Act
        String result = TextNode.stripLeadingWhitespace(sb.toString());

        // Assert
        assertEquals("Hello ", result);
    }

    @Test
    public void lastCharIsWhitespace_thenReturnTrue() {
        // Arrange
        String text = "Hello World";

        // Act
        boolean result = TextNode.lastCharIsWhitespace(text);

        // Assert
        assertTrue(result);
    }

}