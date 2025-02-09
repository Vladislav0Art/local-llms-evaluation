package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathWithDocumentTest {

    @Test
    public void selectXpathWithDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document documentMock = Mockito.mock(org.w3c.dom.Document.class);
        NodeList resultingNodeList = w3CDom.selectXpath("//p", documentMock);
        assertNotNull(resultingNodeList);
    }

}