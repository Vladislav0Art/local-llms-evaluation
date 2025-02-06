package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedSelectXpathNodeListWithContextNode_ReturnsNonNullList {

    @Test
    public void selectXpathNodeListWithContextNode_ReturnsNonNullList() {
        NodeList nodeList = new NodeList();
        Node contextNode = new Element();
        NodeList selectedNodes = W3CDom.selectXpath("//node", nodeList, contextNode);
        assertNotNull(selectedNodes);
    }

}