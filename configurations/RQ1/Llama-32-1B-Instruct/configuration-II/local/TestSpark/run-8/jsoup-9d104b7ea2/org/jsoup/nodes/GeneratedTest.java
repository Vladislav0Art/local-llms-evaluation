package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testIsBlank_returnsTrue() {
        Node node = new TextNode("   \n");
        assertTrue(node.isBlank());
    }

    @Test
    public void testIsBlank_returnsFalseIfNoWhitespace() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText_splitsAtOffset() {
        Node node = new TextNode("a b c");
        node.text("   ");
        assertTrue(node.splitText(2).isBlank());
    }

    @Test
    public void testSplitText_returnsNewNodeWithTextAfterOffset() {
        Node node = new TextNode("a b c");
        node.text("   ");
        String text = "";
        TextNode result = node.splitText(2);
        assertTrue(result.text().isEmpty());
        assertEquals(node, result);
    }

    @Test
    public void testOuterHtmlHead_HandlesPrettyPrint() {
        Node parentNode = new TextNode("<html><body></body></html>");
        Node documentOutputSettings = Mockito.mock(Document.OutputSettings.class);
        Document document = new Document();
        document.addChild(parentNode);
        documentOutputSettings.put("prettyPrint", true);

        String html = parentNode.outerHtmlHead(documentOutputSettings, 0, documentOutputSettings);
        assertTrue(html.contains("\n\n"));
    }

    @Test
    public void testOuterHtmlTail_HandlesPrettyPrint() {
        Node parentNode = new TextNode("<html><body></body></html>");
        Node documentOutputSettings = Mockito.mock(Document.OutputSettings.class);
        Document document = new Document();
        document.addChild(parentNode);
        documentOutputSettings.put("prettyPrint", true);

        String html = parentNode.outerHtmlTail(documentOutputSettings, 0, documentOutputSettings);
        assertTrue(html.contains("\n\n"));
    }

    @Test
    public void testOuterHtmlHead_HandlesTrimLeading() {
        Node parentNode = new TextNode("<html><body></body></html>");
        Node documentOutputSettings = Mockito.mock(Document.OutputSettings.class);
        Document document = new Document();
        document.addChild(parentNode);
        documentOutputSettings.put("prettyPrint", true);

        String html = parentNode.outerHtmlHead(documentOutputSettings, 0, documentOutputSettings);
        assertTrue(html.startsWith("\n"));
    }

    @Test
    public void testOuterHtmlTail_HandlesTrimLeading() {
        Node parentNode = new TextNode("<html><body></body></html>");
        Node documentOutputSettings = Mockito.mock(Document.OutputSettings.class);
        Document document = new Document();
        document.addChild(parentNode);
        documentOutputSettings.put("prettyPrint", true);

        String html = parentNode.outerHtmlTail(documentOutputSettings, 0, documentOutputSettings);
        assertTrue(html.startsWith("\n"));
    }

    @Test
    public void testOuterHtmlHead_HandlesTrimTrailing() {
        Node parentNode = new TextNode("<html><body></body></html>");
        Node documentOutputSettings = Mockito.mock(Document.OutputSettings.class);
        Document document = new Document();
        document.addChild(parentNode);
        documentOutputSettings.put("prettyPrint", true);

        String html = parentNode.outerHtmlHead(documentOutputSettings, 0, documentOutputSettings);
        assertTrue(html.endsWith("\n"));
    }

    @Test
    public void testOuterHtmlTail_HandlesTrimTrailing() {
        Node parentNode = new TextNode("<html><body></body></html>");
        Node documentOutputSettings = Mockito.mock(Document.OutputSettings.class);
        Document document = new Document();
        document.addChild(parentNode);
        documentOutputSettings.put("prettyPrint", true);

        String html = parentNode.outerHtmlTail(documentOutputSettings, 0, documentOutputSettings);
        assertTrue(html.endsWith("\n"));
    }

}