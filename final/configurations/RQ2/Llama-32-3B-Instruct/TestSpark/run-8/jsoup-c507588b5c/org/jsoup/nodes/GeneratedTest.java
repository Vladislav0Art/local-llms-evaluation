package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyText_ReturnsNull() {
        TextNode node = new TextNode("");
        assertEquals(null, node.nodeName());
    }

    @Test
    public void nodeName_SimpleText_ReturnsText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.nodeName());
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void text_SimpleText_ReturnsText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

    @Test
    public void text_MultipleLines_ReturnsAllLines() {
        TextNode node = new TextNode("Line 1\nLine 2");
        assertEquals("Line 1\nLine 2", node.text());
    }

    @Test
    public void text_SpecialChars_ReturnsWithSpecialChars() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void text_NoText_ReturnsNull() {
        TextNode node = null;
        assertNull(node.text());
    }

    @Test
    public void splitText_SplitAtOffset_ReturnsSplitText() {
        TextNode node = new TextNode("Hello World");
        TextNode expected = new TextNode("Hello");
        Node child = new LeafNode("");
        assertEquals(expected, node.splitText(6).child(0));
    }

    @Test
    public void splitText_NoSplit_ReturnsOriginalNode() {
        TextNode node = new TextNode("Hello");
        assertEquals(node, node.splitText(10));
    }

    @Test
    public void isBlank_EmptyText_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_NonEmptyText_ReturnsFalse() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

    @Test
    public void outerHtmlHead_EmptyText_Html() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = null;
        when(out.toString()).thenReturn("");
        when(out.toString(deep(0))).thenReturn("<span>");
        when(accum.append(anyString())).thenReturn(accum);
        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, depth, out);
    }

    @Test
    public void outerHtmlTail_EmptyText_Html() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = null;
        when(out.toString()).thenReturn("");
        when(accum.append(anyString())).thenReturn(accum);
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, depth, out);
    }

    @Test
    public void clone_ClonedNode() {
        TextNode original = new TextNode("Hello");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

    @Test
    public void createFromEncoded_EncodedText_ReturnsNode() {
        String encodedText = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

    @Test
    public void normaliseWhitespace_SimpleText_ReturnsWithSpaces() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        when(StringUtil.normaliseWhitespace(anyString())).thenReturn(" ");
        String text = "Hello";
        assertEquals(" Hello ", StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void normaliseWhitespace_NoWhitespaces_ReturnsOriginalText() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        String text = "";
        assertEquals("", StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_SimpleText_ReturnsWithTrailingSpaces() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("Hello ");
        when(StringUtil.stripLeadingWhitespace(anyString())).thenReturn(" Hello");
        String text = "Hello ";
        assertEquals(" Hello", StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_NoLeadingWhitespaces_ReturnsOriginalText() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        when(StringUtil.stripLeadingWhitespace(anyString())).thenReturn("");
        String text = "";
        assertEquals("", StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespace_SingleCharacterWhitespace_ReturnsTrue() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn(" ");
        assertTrue(lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespace_NoWhitespace_ReturnsFalse() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        assertFalse(lastCharIsWhitespace(sb));
    }

}