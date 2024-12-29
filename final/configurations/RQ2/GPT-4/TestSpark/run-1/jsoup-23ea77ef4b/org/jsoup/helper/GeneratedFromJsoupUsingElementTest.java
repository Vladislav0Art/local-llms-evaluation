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

public class GeneratedFromJsoupUsingElementTest {

    @Test
    public void fromJsoupUsingElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element jsoupElement = mock(Element.class);
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(jsoupElement);
        assertNotNull(w3cDocument);
    }

}