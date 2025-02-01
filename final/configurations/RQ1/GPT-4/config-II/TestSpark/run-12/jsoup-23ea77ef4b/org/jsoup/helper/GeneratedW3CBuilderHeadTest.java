package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class GeneratedW3CBuilderHeadTest {

    @Test
    public void w3CBuilderHeadTest() {
        Document doc = Mockito.mock(Document.class);
        W3CDom.W3CBuilder w3CBuilder = new W3CDom.W3CBuilder(doc);
        Mockito.when(doc.getUserData(W3CDom.ContextProperty)).thenReturn(null);
        Document node = Mockito.mock(Document.class);
        w3CBuilder.head(node, 1);
        verify(doc, atLeastOnce()).getUserData("");
    }

}