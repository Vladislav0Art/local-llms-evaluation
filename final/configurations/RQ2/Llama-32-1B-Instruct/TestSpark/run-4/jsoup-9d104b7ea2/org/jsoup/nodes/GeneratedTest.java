package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void testText_createFromEncoded() {
        String encodedText = "Hello World";
        TextNode createdNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, createdNode.text());
    }

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello   World  ";
        String normalisedText = normalizeWhitespace(text);
        assertEquals("Hello World", normalisedText);
    }

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   Hello   World  ";
        StringBuilder sb = new StringBuilder();
        stripLeadingWhitespace(sb, text);
        assertEquals("Hello World", sb.toString());
    }

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        lastCharIsWhitespace(sb);
        assertTrue(sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ');
    }

}