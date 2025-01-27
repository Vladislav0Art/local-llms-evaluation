package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        // Given
        String text = "Hello World";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_TextNode_ReturnsTagName() {
        // Given
        TextNode textNode = new TextNode("tagName");

        // When
        String nodeName = textNode.nodeName();

        // Then
        assertEquals("tagName", nodeName);
    }

    @Test
    public void text(TextNode_ReturnsTextContent() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String text = textNode.text();

        // Then
        assertNotNull(text);
        assertEquals("Hello World", text);
    }

    @Test
    public void text_TextNodeAssigningNewText_ReturnsUpdatedText() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String updatedText = "New Text";

        // Then
        textNode.text(updatedText);

        assertEquals(updatedText, textNode.text());
    }

    @Test
    public void getWholeText_TextNode_ReturnsTextContent() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertNotNull(wholeText);
        assertEquals("Hello World", wholeText);
    }

    @Test
    public void isBlank_TextNode_ReturnsTrueIfTextIsBlank() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean isBlank = textNode.isBlank();

        // Then
        assertTrue(isBlank);
    }

    @Test
    public void clone_TextNode_ReturnsClone() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        TextNode clone = textNode.clone();

        // Then
        assertNotNull(clone);
        assertEquals(textNode, clone);
    }

    @Test
    public void createFromEncoded_TextNode_CreatesTextNodeFromEncodedText() {
        // Given
        String encodedText = "encodedText";

        // When
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Then
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void normaliseWhitespace_TextString_ReturnsNormalizedText() {
        // Given
        String text = "   Hello World  ";

        // When
        String normalizedText = StringUtil.normaliseWhitespace(text);

        // Then
        assertNotNull(normalizedText);
        assertEquals("Hello World", normalizedText);
    }

    @Test
    public void stripLeadingWhitespace_TextString_ReturnsTextWithLeadingWhitespaceRemoved() {
        // Given
        String text = "   Hello World  ";

        // When
        String strippedText = StringUtil.stripLeadingWhitespace(text);

        // Then
        assertNotNull(strippedText);
        assertEquals("Hello World", strippedText);
    }

    @Test
    public void lastCharIsWhitespace_StringBuilder_ReturnsTrueIfLastCharIsWhitespace() {
        // Given
        StringBuilder sb = new StringBuilder("   ");

        // When
        boolean isWhitespace = StringUtil.lastCharIsWhitespace(sb);

        // Then
        assertTrue(isWhitespace);
    }

}