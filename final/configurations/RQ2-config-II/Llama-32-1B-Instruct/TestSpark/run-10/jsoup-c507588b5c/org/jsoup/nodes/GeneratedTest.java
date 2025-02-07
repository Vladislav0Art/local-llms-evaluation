package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void testnodeNameReturnsText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node nodeName());
    }

    @Test
    public void testGetWholeTextReturnsOriginalText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node getWholeText());
    }

    @Test
    public void testIsBlankReturnsFalse() {
        TextNode node = new TextNode("   Hello   ");
        assertTrue(node isBlank());
    }

    @Test
    public void testSplitTextReturnsTextSlice() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        String[] slice = node splitText(4);
        assertEquals("Hello", slice[0]);
        assertEquals("World", slice[1]);
        assertArrayEquals(null, slice[2]);
    }

    @Test
    public void testCloneReturnsSameInstance() {
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();
        assertTrue(original == cloned);
    }

    @Test
    public void testToStringReturnsTextRepresentation() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node toString());
    }

    @Test
    public void testCreateFromEncodedReturnsTextNode() {
        String encodedText = "<p>Hello World</p>";
        TextNode node = NodeUtilscreateFromEncoded(encodedText);
        assertTrue(node instanceof TextNode);
    }

    @Test
    public void testNormaliseWhitespaceReturnsOriginalWhitespace() {
        String text = "   Hello   ";
        assertEquals("Hello ", Normalizer.normalizeWhitespace(text));
    }

    @Test
    public void testStripLeadingWhitespaceReturnsOriginalString() {
        String text = "   Hello World  ";
        assertEquals("Hello World", StripLeadingWhitespace.strip(text));
    }

    @Test
    public void testLastCharIsWhitespaceReturnsFalse() {
        TextNode node = new TextNode("Hello");
        assertTrue(!node.lastCharIsWhitespace(new StringBuilder()));
    }

}