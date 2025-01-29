package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("test");
        assertNotNull(node.text());
        assertEquals("test", node.text());
        assertNull(node.text(null));
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("test");
        String text = "test";
        assertNotNull(node.getWholeText());
        assertEquals(text, node.getWholeText());
        assertNull(node.getWholeText(null));
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("test");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank(null));
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("test");
        int offset = 2;
        assertNotNull(node.splitText(offset));
        assertEquals(3, node.splitText(offset).text().length());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Appendable accum = null;
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, depth, out);
        assertEquals("test", new String(accum));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        Appendable accum = null;
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode node = new TextNode("test");
        node.outerHtmlTail(accum, depth, out);
        assertEquals("test", new String(accum));
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("test");
        assertNotNull(node.toString());
        assertEquals("test", node.toString());
        assertNull(node.toString(null));
    }

    @Test
    public void testClone() {
        TextNode node = new TextNode("test");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals(node, clone);
    }

    @Test
    public void testCreateFromEncoded() throws IOException {
        String encodedText = "test";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("test", node.text());
    }

    @Test
    public void testNormaliseWhitespace() {
        String text = "   ";
        String normalized = normaliseWhitespace(text);
        assertEquals("", normalized);
        normalized = stripLeadingWhitespace(normalized);
        assertEquals(" ", normalized);
    }

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   ";
        StringBuilder builder = new StringBuilder();
        assertTrue(lastCharIsWhitespace(builder, " "));
        assertTrue(lastCharIsWhitespace(builder, "\n"));
        assertTrue(lastCharIsWhitespace(builder, "\t"));
        assertTrue(lastCharIsWhitespace(builder, "\r"));
    }

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        assertTrue(lastCharIsWhitespace(sb, 'a'));
        assertTrue(lastCharIsWhitespace(sb, '\n'));
        assertTrue(lastCharIsWhitespace(sb, '\t'));
        assertTrue(lastCharIsWhitespace(sb, "\r"));
    }

}