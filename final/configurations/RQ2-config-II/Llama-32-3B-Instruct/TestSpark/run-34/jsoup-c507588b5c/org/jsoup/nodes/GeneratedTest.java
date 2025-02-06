package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

    @Test
    public void nodeName_NullText_ReturnsNull() {
        TextNode node = new TextNode(null);
        assertNull(node.nodeName());
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void text_NullText_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).text());
    }

    @Test
    public void text_NoWhitespace_ReturnsOriginalString() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

    @Test
    public void text_WithWhitespace_ReturnsNormalizedString() {
        String text = "   Hello   ";
        TextNode node = new TextNode(text);
        assertEquals(TextNode.normaliseWhitespace(text), node.text());
    }

    @Test
    public void splitText_SplitsTextAtOffset() {
        TextNode node = new TextNode("Hello World");
        TextNode result = node.splitText(6);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

    @Test
    public void splitText-

    offsetIsEqualToLength_ReturnsEmptyString() {
        TextNode node = new TextNode("Hello");
        TextNode result = node.splitText(node.length());
        assertSame("", result.text());
    }

    @Test
    public void clone_CreatesCopyOfCurrentNode() {
        TextNode node = new TextNode("Hello");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node.text(), cloned.text());
    }

    @Test
    public void outerHtmlHead_ThrowsIOExceptionWhenEncodingFails() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(OutputMode.XML);
        TextNode node = new TextNode("Hello");
        assertThrows(IOException.class, () -> node.outerHtmlHead(accum, 0, out));
    }

    @Test
    public void outerHtmlTail_DoesNotThrowIOExceptionWhenEncodingSucceeds() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("Hello");
        node.outerHtmlHead(accum, 0, out);
        assertDoesNotThrow(() -> node.outerHtmlTail(accum, 0, out));
    }

}