package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestClone {

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