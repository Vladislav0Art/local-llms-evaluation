package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        Document doc = mock(Document.class);
        when(doc.getDocumentRoot()).thenReturn(null);
        TextNode splitNode = textNodeSplitText(doc, 5);
        assertNotNull(splitNode);
        assertEquals("Hello World", splitNode.text());
        verify(doc).getTextRange(0, 5);
    }

}