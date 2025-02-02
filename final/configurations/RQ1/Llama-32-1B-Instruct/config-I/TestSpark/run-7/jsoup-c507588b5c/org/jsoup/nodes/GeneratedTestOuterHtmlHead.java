package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestOuterHtmlHead {

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

}