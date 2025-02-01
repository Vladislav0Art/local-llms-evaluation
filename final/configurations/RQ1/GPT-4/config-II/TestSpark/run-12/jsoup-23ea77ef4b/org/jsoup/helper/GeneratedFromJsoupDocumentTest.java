package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.ownerDocument()).thenReturn(document);
        org.w3c.dom.Document documentResult = w3CDom.fromJsoup(document);
        verify(document, atLeastOnce()).ownerDocument();
    }

}