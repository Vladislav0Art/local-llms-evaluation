package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        Document doc = mock(Document.class);
        when(doc.getDocumentRoot()).thenReturn(null);
        TextNode splitNode = textNodeSplitText(doc, 5);
        assertNotNull(splitNode);
        assertEquals("Hello World", splitNode.text());
        verify(doc).getTextRange(0, 5);
    }

    @Test
    public void testOuterHtmlHead() {
        Document doc = mock(Document.class);
        when(doc.getDocumentRoot()).thenReturn(null);
        ApplicableNode applicable = mock(ApplicableNode.class, times(1));
        String headContent = "   <h2>Inner</h2>";
        when(applicable.get OuterHtmlHead(any(Appendable.class), 0, any Document.OutputSettings.class)).thenReturn(headContent);

        TextNode textNode = new TextNode("   Hello World  ");
        when(doc.createTextNode(textNode)).thenReturn(textNode);
        TextNode result = textNode.outerHtmlHead(applicable, 0, doc.getOutputSettings());
        assertTrue(result.isBlank());
    }

    @Test
    public void testOuterHtmlTail() {
        Document doc = mock(Document.class);
        when(doc.getDocumentRoot()).thenReturn(null);
        ApplicableNode applicable = mock(ApplicableNode.class, times(1));
        String tailContent = "   <h2>Inner</h2>";
        when(applicable.get OuterHtmlTail(any(Appendable.class), 0, any Document.OutputSettings.class)).thenReturn(tailContent);

        TextNode textNode = new TextNode("   Hello World  ");
        when(doc.createTextNode(textNode)).thenReturn(textNode);
        TextNode result = textNode.outerHtmlTail(applicable, 0, doc.getOutputSettings());
        assertTrue(result.isBlank());
    }

    @Test
    public void testClone() {
        Document doc = mock(Document.class);
        when(doc.getDocumentRoot()).thenReturn(null);
        ApplicableNode applicable = mock(ApplicableNode.class, times(1));
        String content = "<h2>Inner</h2>";
        when(applicable.get OuterHtmlHead(any(Appendable.class), 0, any Document.OutputSettings.class)).thenReturn(content);

        TextNode textNode = new TextNode("   Hello World  ");
        when(doc.createTextNode(textNode)).thenReturn(textNode);
        ApplicableNode cloneApplicable = mock(ApplicableNode.class, times(1));
        when(cloneApplicable.get OuterHtmlHead(any(Appendable.class), 0, any Document.OutputSettings.class)).thenReturn(content);
        TextNode cloneTextNode = textNode.clone(cloneApplicable);
        verify(applicable).get OuterHtmlHead(any(Appendable.class), 0, any Document.OutputSettings.class);
        verify(doc).setTextContent(anyString());
        assertEquals("   Hello World  ", cloneTextNode.text());
    }

    private TextNode textNodeSplitText(Document doc, int index) {
        // Create a document with the given content
        return new TextNode(doc.getTextRange(0, index));
    }

}