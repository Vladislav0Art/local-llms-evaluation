package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
        assertEquals("Hello", node.text());
        assertEquals("", node.getWholeText());
        assertEquals("Hello ", node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello, world! Hello again.");
        assertEquals(5, node.splitText(7));
        assertEquals("", node.splitText(-1));
    }

    @Test
    public void testOuterHtmlHeadAppendable() throws IOException {
        Document document = new Document();
        Appendable accum = document.getOwnerDocument().getOutputStream().append("Hello\nWorld");
        TextNode head = new TextNode(document, 0);
        head.outerHtmlHead(accum, 1, null).toString();
    }

    @Test
    public void testOuterHtmlTailAppendable() throws IOException {
        Document document = new Document();
        Appendable accum = document.getOwnerDocument().getOutputStream().append("Hello\nWorld");
        TextNode tail = new TextNode(document, 0);
        tail.outerHtmlTail(accum, 1, null).toString();
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.toString());
    }

    @Test
    public void testClone() {
        TextNode node = new TextNode("Hello World");
        TextNode cloned = node.clone();
        // check that the cloned node is not null and has a different text
    }

    @Test
    public void testNormaliseWhitespace() {
        String originalText = "   Hello   World  ";
        String normalizedText = TextNode.normaliseWhitespace(originalText);
        assertEquals("Hello World", normalizedText);
    }

    @Test
    public void testStripLeadingWhitespaceBuilderStringBuilder() throws Exception {
        StringBuilder sb = new StringBuilder();
        TextNode node = new TextNode("   Hello   World  ");
        node.stripLeadingWhitespace(sb).toString();
        // check that the text is stripped to "Hello World"
    }

}