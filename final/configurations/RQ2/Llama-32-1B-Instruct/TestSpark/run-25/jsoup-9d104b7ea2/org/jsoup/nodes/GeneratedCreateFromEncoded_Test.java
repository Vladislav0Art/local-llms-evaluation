package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedCreateFromEncoded_Test {

    @Test
    public void createFromEncoded_Test() {
        Node node = new TextNode("Hello, World!");
        assertEquals(node, createFromEncoded("Hello, World!"));
    }

    static String normaliseWhitespace(String text) {
        return StringUtil.normalizeWhitespace(text);
    }

    static String stripLeadingWhitespace(StringBuilder sb) {
        return sb.toString().trim();
    }

    private void assertNodeName(Node node, String expected) {
        assertEquals(expected, getNodeName(node));
    }

    private void assertTextNode(Node node, TextNode newNode) {
        Node cloned = clone(node);
        assertNodeIsEqual(cloned, newNode);
    }

    private void assertSplitText(Node node, int offset) {
        Node[] splitNodes = splitText(offset);
        assertEquals(splitNodes.length, 1);

        TextNode splitTextNode = splitNodes[0];
        assertNodeIsEqual(node, splitTextNode);
    }

    private void assertGetWholeText(Node node) {
        String text = getNodeWholeText(node);
        assertTrue(text.contains("Hello, World!"));
    }

    private void assertIsBlank(Node node) {
        boolean isBlank = getNodeIsBlank(node);
        assertTrue(isBlank);

        node = Mockito.mock(TextNode.class);
        String text = "   ";
        assertFalse(getNodeIsBlank(node));
    }

    private void assertGetWholeTextWithException(Node node, int offset) throws Exception {
        Node[] splitNodes = splitText(offset);
        assertEquals(splitNodes.length, 1);

        TextNode splitTextNode = splitNodes[0];
        try {
            getNodeWholeText(node);
        } catch (Exception e) {
            Mockito.verify(e).toThrow(Exception.class);
        }

        node = Mockito.mock(TextNode.class);
        offset = 10;
        splitTextNode = splitText(offset, null);
    }

    private void assertOuterHtmlHead(Node node, int depth, Document.OutputSettings out) {
        Node[] outerHtmlNodes = outerHtmlHead(node, depth, out);
        assertEquals(1, outerHtmlNodes.length);

        TextNode outerHtmlTextNode = outerHtmlNodes[0];
        Mockito.verify(out).setOutputString("Hello, World!");
    }

    private void assertOuterHtmlTail(Node node, int depth, Document.OutputSettings out) {
        Node[] outerHtmlNodes = outerHtmlTail(node, depth, out);
        assertEquals(1, outerHtmlNodes.length);

        TextNode outerHtmlTextNode = outerHtmlNodes[0];
        Mockito.verify(out).setOutputString("Hello, World!");
    }

    private void assertToString(Node node) {
        String text = getNodeToString(node);
        assertTrue(text.contains("Hello, World!"));
    }

    private void assertClone(Node node) {
        Node cloned = clone(node);
        assertEquals(node, cloned);
    }

}