package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello");
        when(node.nodeName()).thenReturn("node");

        assertEquals("node", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello");
        String text = "Hello World";
        assertEquals(text, node.text());

        when(node.text()).thenReturn(text);
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello World");
        String expected = "Hello World";
        String actual = node.getWholeText();
        assertNotEquals(expected, actual);

        verify(StringUtil).splitText(0); // This should not be called

        String truncated = node.getWholeText(10);
        assertEquals(expected.substring(0, 10), truncated);
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());

        when(node.isBlank()).thenReturn(true);

        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World");
        int offset = 10;
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(offset));
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = Document.OutputSettings.INDENT_FALSE;
        outerHtmlHead(accum, 0, out);
        assertEquals("<node>\n<text>Hello World</text>\n</node>", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = Document.OutputSettings.INDENT_FALSE;
        outerHtmlHead(accum, 0, out);
        outerHtmlTail(accum, 0, out);
        assertEquals("<node>\n<text>Hello World</text>", accum.toString());
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello");
        String expected = "TextNode(node=Hello)";
        assertEquals(expected, node.toString());

        when(node.toString()).thenReturn(expected);
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = (TextNode) node.clone();
        assertNotSame(node1, node2);

        when(node2.text()).thenReturn("World");

        assertEquals("Hello", node2.text());
    }

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "Hello World";
        TextNode node = createFromEncoded(encodedText);
        verify(normaliseWhitespace).stripLeadingWhitespace(encodedText);
    }

    @Test
    public void testNormaliseWhitespace() {
        TextNode node = new TextNode("   Hello   ");
        when(node.normaliseWhitespace()).thenReturn("Hello");
    }

    @Test
    public void testStripLeadingWhitespace() {
        TextNode node = new TextNode("");
        when(node.stripLeadingWhitespace()).thenReturn(new StringBuilder());
    }

}