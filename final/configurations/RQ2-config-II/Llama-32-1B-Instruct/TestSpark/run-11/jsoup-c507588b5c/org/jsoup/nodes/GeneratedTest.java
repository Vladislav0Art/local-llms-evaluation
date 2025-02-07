package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello, World!");
        String text = node.text();
        assertEquals("Hello, World!", text);
    }

    @Test
    public void testTextFromEncoded() throws Exception {
        String encodedText = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello");
        assertEquals(1, node.splitText(0));
        assertEquals(2, node.splitText(3));
    }

    @Test
    public void testOuterHtmlHead() throws Exception {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        TextNode node = new TextNode("Hello");
        Mockito.when(document.outerHtmlHead(accum, depth, document.getOutputSettings())).thenReturn(Mockito.anyString());
        assertTrue(node.outerHtmlHead(accum, depth, document.getOutputSettings()) == null);
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        TextNode node = new TextNode("Hello");
        Mockito.when(document.outerHtmlTail(accum, depth, document.getOutputSettings())).thenReturn(Mockito.anyString());
        assertTrue(node.outerHtmlTail(accum, depth, document.getOutputSettings()) == null);
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello");
        assertEquals("<Text> Hello </Text>", node.toString());
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}