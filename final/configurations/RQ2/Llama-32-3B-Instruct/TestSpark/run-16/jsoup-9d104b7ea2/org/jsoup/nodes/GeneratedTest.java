package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newNodeTextIsNull() {
        assertNull(new TextNode(null).text());
    }

    @Test
    public void newNodeTextIsBlankWhenEmptyStringIsPassed() {
        String blankText = "";
        TextNode textNode = new TextNode(blankText);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void newNodeTextIsBlankWhenOnlyWhitespaceIsPassed() {
        String blankText = "   ";
        TextNode textNode = new TextNode(blankText);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void newNodeTextIsNotBlankWhenNonEmptyStringIsPassed() {
        String nonBlankText = "Hello";
        TextNode textNode = new TextNode(nonBlankText);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void cloneReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

    @Test
    public void createFromEncodedStringReturnsValidTextNode() throws IOException {
        String encodedText = "Hello";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.text());
    }

    @Test
    public void textReturnsOriginalTextWhenPassed() {
        String originalText = "Hello";
        TextNode textNode = new TextNode(originalText);
        assertEquals(originalText, textNode.text());
    }

    @Test
    public void getWholeTextReturnsEmptyStringWhenTextNodeIsBlank() {
        String blankText = "";
        TextNode textNode = new TextNode(blankText);
        assertEquals(blankText, textNode.getWholeText());
    }

    @Test
    public void getWholeTextReturnsOriginalTextWhenNonBlankTextNodeIsPassed() {
        String nonBlankText = "Hello";
        TextNode textNode = new TextNode(nonBlankText);
        assertEquals(nonBlankText, textNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadThrowsIOExceptionWhenAppendableCannotBeWrittenTo() throws IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("Hello");
        try {
            textNode.outerHtmlHead(appendable, 0, outputSettings);
            fail("IOException was not thrown");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void outerHtmlTailThrowsIOExceptionWhenAppendableCannotBeWrittenTo() throws IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("Hello");
        try {
            textNode.outerHtmlTail(appendable, 0, outputSettings);
            fail("IOException was not thrown");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void splitTextReturnsNullWhenOffsetIsNegative() {
        String originalText = "Hello";
        TextNode textNode = new TextNode(originalText);
        assertNull(textNode.splitText(-1));
    }

    @Test
    public void splitTextReturnsEmptyStringWhenOffsetIsZero() {
        String originalText = "Hello";
        TextNode textNode = new TextNode(originalText);
        assertEquals("", textNode.splitText(0));
    }

}