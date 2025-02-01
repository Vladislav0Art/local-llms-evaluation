package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        w3CDom.contextNode(document);
        verify(document, atLeastOnce()).getUserData(W3CDom.ContextNodeProperty);
    }

}