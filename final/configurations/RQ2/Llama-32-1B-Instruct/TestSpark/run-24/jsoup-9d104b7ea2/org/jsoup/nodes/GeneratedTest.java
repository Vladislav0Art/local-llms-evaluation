package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    public Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testnodeName() {
        Document document = new Document();
        Element element = document.createElement("span");
        TextNode node = new TextNode(document, "Hello World");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void test_text() {
        Document document = new Document();
        Element element = document.createElement("div");
        TextNode node = new TextNode(document, "This is a sample text.");
        assertEquals("text", node.text());
    }

    @Test
    public void test_textWithBlank() {
        Document document = new Document();
        Element element = document.createElement("span");
        TextNode node = new TextNode(document, "");
        assertEquals("", node.text());
    }

    @Test
    public void testGetWholeText() {
        Document document = new Document();
        Element element = document.createElement("div");
        TextNode node = new TextNode(document, "This is a sample text.");
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        Document document = new Document();
        Element element = document.createElement("span");
        TextNode node = new TextNode(document, "");
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        Document document = new Document();
        Element element = document.createElement("div");
        TextNode node = new TextNode(document, "This is a sample text.");
        assertEquals(3, node.splitText(2).size());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        // Create a mock DocumentOutputSettings object to be used for testing
        Document.OutputSettings settings = mock(Document.OutputSettings.class);
        Document document = new Document();
        document.setOutputSettings(settings);

        Node node = new TextNode(document, "This is a sample text.");
        when(node.outerHtmlHead(any(Appendable.class), anyInt(), any.Document.OutputSettings.class)).thenReturn("Hello World");
        assertEquals("Hello World", node.outerHtmlHead(null, 0, null).toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        // Create a mock DocumentOutputSettings object to be used for testing
        Document.OutputSettings settings = mock(Document.OutputSettings.class);
        Document document = new Document();
        document.setOutputSettings(settings);

        Node node = new TextNode(document, "This is a sample text.");
        when(node.outerHtmlTail(any(Appendable.class), anyInt(), any.Document.OutputSettings.class)).thenReturn("Sample");
        assertEquals("Sample", node.outerHtmlTail(null, 0, null).toString());
    }

    @Test
    public void testToString() {
        Document document = new Document();
        Element element = document.createElement("span");
        TextNode node = new TextNode(document, "This is a sample text.");
        assertEquals("text", node.toString());
    }

}