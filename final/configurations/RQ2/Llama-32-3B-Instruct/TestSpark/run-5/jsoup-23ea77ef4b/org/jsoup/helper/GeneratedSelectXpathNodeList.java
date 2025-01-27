package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedSelectXpathNodeList {

    @Test
    public void selectXpathNodeList() {
        NodeList nodeList = new org.jsoup.nodes.NodeList();
        when(org.jsoup.select.NodeTraversor.select(nodeList, XPathConstants.NODES)).thenReturn(nodeList);
        NodeList result = W3CDom.selectXpath("xpath", null);
        assertEquals(1, result.size());
    }

}