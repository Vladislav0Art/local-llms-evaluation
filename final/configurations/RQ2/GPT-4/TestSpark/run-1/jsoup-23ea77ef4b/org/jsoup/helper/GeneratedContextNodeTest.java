package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document w3cDocument = mock(org.w3c.dom.Document.class);
        Node contextNode = w3cDom.contextNode(w3cDocument);
        assertNotNull(contextNode);
    }

}