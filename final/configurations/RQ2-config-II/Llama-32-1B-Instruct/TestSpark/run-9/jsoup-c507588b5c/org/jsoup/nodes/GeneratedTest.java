package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
        assertEquals("", node.text(""));
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertFalse(node.isBlank());
        assertFalse(new TextNode(" ").isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World");
        assertEquals(2, node.splitText(0));
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        String encodedText = "hello world";
        TextNode node = new TextNode(encodedText);
        node.outerHtmlHead(new Appendable(), 1, Document.OutputSettings.INDENT);
        assertEquals("  hello   world", new StringBuilder().append(node).toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        String encodedText = "hello world";
        TextNode node = new TextNode(encodedText);
        node.outerHtmlHead(new Appendable(), 1, Document.OutputSettings.INDENT);
        assertEquals("  hello   world", new StringBuilder().append(node).toString());
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<text>hello world</text>", node.toString());
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello  World   ";
        assertEquals("Hello World", normalizeWhitespace(text));
    }

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   Hello   World";
        assertEquals("Hello World", stripLeadingWhitespace(text));
    }

    @Test
    public void testLastCharIsWhitespaceStringBuilder() {
        StringBuilder sb = new StringBuilder();
        assertTrue(lastCharIsWhitespace(sb));
    }

}