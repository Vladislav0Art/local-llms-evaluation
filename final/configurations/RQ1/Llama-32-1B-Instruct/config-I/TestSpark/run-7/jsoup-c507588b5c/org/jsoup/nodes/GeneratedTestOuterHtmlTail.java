package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestOuterHtmlTail {

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

}