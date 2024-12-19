package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenString_ReturnsTextNodeWithSuppliedValue() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void createTextNode_EmptyString_ReturnsBlankTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_GivenOffset_ReturnsNewTextNodeWithSplitValue() throws IOException {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = 5;
        TextNode newTextNode = textNode.splitText(offset);
        assertEquals("Hello", newTextNode.text());
    }

    @Test
    public void splitText_GivenInvalidOffset_ThrowsInvalidArgumentException() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = -1;
        try {
            textNode.splitText(offset);
            assert false : "Expected InvalidArgumentException to be thrown";
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void normalizeWhitespace_GivenString_ReturnsNormalizedValue() {
        String input = "   ";
        assertEquals("   ", TextNode.normaliseWhitespace(input));
    }

    @Test
    public void outerHtml_WhenPrettyPrintIsTrue_WritesWithNormalisedWhitespaces() throws IOException {
        String originalText = "   Hello World  ";
        Document.OutputSettings out = new Document.OutputSettings(true);
        Appendable accum = new StringBuilder();
        TextNode textNode = new TextNode(originalText);
        out.outerHtmlHead(accum, 0, out);
        assertEquals("Hello World", accum.toString());
    }

    @Test
    public void outerHtml_WhenPrettyPrintIsFalse_WritesWithoutNormalisedWhitespaces() throws IOException {
        String originalText = "   Hello World  ";
        Document.OutputSettings out = new Document.OutputSettings(false);
        Appendable accum = new StringBuilder();
        TextNode textNode = new TextNode(originalText);
        out.outerHtmlHead(accum, 0, out);
        assertEquals("  Hello World  ", accum.toString());
    }

}