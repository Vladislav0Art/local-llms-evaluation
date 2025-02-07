package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws Exception {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        TextNode node = new TextNode("Hello");
        Mockito.when(document.outerHtmlTail(accum, depth, document.getOutputSettings())).thenReturn(Mockito.anyString());
        assertTrue(node.outerHtmlTail(accum, depth, document.getOutputSettings()) == null);
    }

}