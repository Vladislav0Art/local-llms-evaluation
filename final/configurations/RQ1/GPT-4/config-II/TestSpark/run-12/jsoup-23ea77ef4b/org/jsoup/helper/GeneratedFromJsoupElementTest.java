package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3CDom = new W3CDom();
        Element element = Mockito.mock(Element.class);
        Mockito.when(element.ownerDocument()).thenReturn(null);
        org.w3c.dom.Document documentResult = w3CDom.fromJsoup(element);
        verify(element, atLeastOnce()).ownerDocument();
    }

}