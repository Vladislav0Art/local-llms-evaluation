package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document document = Mockito.mock(Document.class);
        org.jsoup.nodes.Element element = Mockito.mock(org.jsoup.nodes.Element.class);
        Mockito.when(document.child(0)).thenReturn(element);
        Mockito.when(document.ownerDocument()).thenReturn(document);
        org.w3c.dom.Document documentResult = W3CDom.convert(document);
        verify(document, atLeastOnce()).ownerDocument();
    }

}