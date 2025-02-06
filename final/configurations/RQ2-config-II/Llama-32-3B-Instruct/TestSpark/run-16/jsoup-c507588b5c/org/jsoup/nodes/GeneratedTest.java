package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void nodeName_ReturnsTextNodeName() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void isBlank_GivenBlankText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenNonBlankText_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_GivenOffset_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(5);
        assertNotNull(result.text());
        assertEquals("World", result.text());
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsTextNodeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void outerHtmlHead_Appendable

    depthDocumentOutputSettings_ThrowsIOException() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        assertThrows(IOException.class, () -> textNode.outerHtmlHead(accum, 0, out));
    }

    @Test
    public void outerHtmlTail_Appendable

    depthDocumentOutputSettings_NoThrowIOException() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, 0, out);
    }

    @Test
    public void clone_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.clone();
        assertNotNull(result.text());
        assertEquals(textNode.text(), result.text());
    }

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "Hello%20World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.text());
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void normaliseWhitespace_GivenText_ReturnsNormalisedText() {
        String text = " Hello World ";
        String result = StringUtil.normaliseWhitespace(text);
        assertEquals("Hello World", result);
    }

    @Test
    public void stripLeadingWhitespace_GivenText_ThrowsStringIndexOutOfBoundsException() {
        StringBuilder sb = Mockito.mock(StringBuilder.class);
        String text = "   Hello World";
        assertThrows(StringIndexOutOfBoundsException.class, () -> StringUtil.stripLeadingWhitespace(text, sb));
    }

}