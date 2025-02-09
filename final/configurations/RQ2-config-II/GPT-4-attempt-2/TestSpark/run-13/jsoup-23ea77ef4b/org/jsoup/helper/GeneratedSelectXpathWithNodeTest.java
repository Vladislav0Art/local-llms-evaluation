package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathWithNodeTest {

    @Test
    public void selectXpathWithNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Node nodeMock = Mockito.mock(Node.class);
        NodeList resultingNodeList = w3CDom.selectXpath("//p", nodeMock);
        assertNotNull(resultingNodeList);
    }

}