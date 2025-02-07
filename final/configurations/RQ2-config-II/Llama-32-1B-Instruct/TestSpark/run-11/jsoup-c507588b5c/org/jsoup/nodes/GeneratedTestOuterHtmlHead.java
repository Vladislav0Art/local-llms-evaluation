package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws Exception {
        Document document = Mockito.mock(Document.class);
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        TextNode node = new TextNode("Hello");
        Mockito.when(document.outerHtmlHead(accum, depth, document.getOutputSettings())).thenReturn(Mockito.anyString());
        assertTrue(node.outerHtmlHead(accum, depth, document.getOutputSettings()) == null);
    }

}