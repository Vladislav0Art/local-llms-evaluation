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

public class GeneratedSelectXpathUsingContextNodeTest {

    @Test
    public void selectXpathUsingContextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        Node nodeContext = mock(Node.class);
        NodeList nodeList = w3cDom.selectXpath("", nodeContext);
        assertNotNull(nodeList);
    }

}