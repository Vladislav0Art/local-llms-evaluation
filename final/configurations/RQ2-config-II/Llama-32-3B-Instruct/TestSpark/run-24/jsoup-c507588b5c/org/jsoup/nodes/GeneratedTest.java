package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

    @Test
    public void nodeName_NonEmptyText_ReturnsText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.nodeName());
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void text_NonEmptyText_ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void text

    AssignNewText_UpdatesTextNodeText() {
        TextNode textNode = new TextNode("Hello World");
        textNode.text("Good Bye World");
        assertEquals("Good Bye World", textNode.text());
    }

    @Test
    public void getWholeText_EmptyTextNode_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void getWholeText_NonEmptyTextNode_ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlank_EmptyTextNode_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_NonEmptyTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplitAtBeginning_ReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(0);
        assertEquals(textNode, result);
    }

    @Test
    public void splitText_SplitAtMiddle_ReturnsNewTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(4);
        assertNotNull(result);
        assertTrue(!result.text().equals(textNode.text()));
    }

    @Test
    public void outerHtmlHead_CalledWithEmptyText_NoOutput() throws IOException {
        Appendable accum = mock(Appendable.class);
        when(accum.append(anyString())).thenReturn(null);
        TextNode textNode = new TextNode("");
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document(out);
        textNode.outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append("<!--").append(textNode.nodeName()).append("-->");
    }

    @Test
    public void outerHtmlTail_CalledWithEmptyText_NoOutput() {
        Appendable accum = mock(Appendable.class);
        TextNode textNode = new TextNode("");
        Document.OutputSettings out = new Document.OutputSettings();
        document.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

    @Test
    public void clone_CreatesDeepCopy() {
        TextNode original = new TextNode("Hello World");
        TextNode copy = original.clone();
        assertNotNull(copy);
        assertEquals(original.text(), copy.text());
    }

    @Test
    public void createFromEncoded_ThrowsIOException_WhenEncodedTextIsEmpty() {
        expectException(IOException.class).value(() -> TextNode.createFromEncoded(""));
    }

    @Test
    public void normaliseWhitespace_ReturnsCorrectText() {
        assertEquals("Hello World", TextNode.normaliseWhitespace("   Hello World  "));
    }

    @Test
    public void stripLeadingWhitespace_ReturnsCorrectText() {
        assertEquals("Hello World", TextNode.stripLeadingWhitespace("   Hello World  "));
    }

    @Test
    public void lastCharIsWhitespace_ReturnsTrue_WhenLastCharIsSpaceOrTab() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("Hello\tWorld")));
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("Hello \nWorld")));
    }

    @Test
    public void lastCharIsWhitespace_ReturnsFalse_WhenLastCharIsLetter() {
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("Hello A")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("World B")));
    }

}