package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() {
        Node contextNode = new NodeImpl();
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = w3CDom.selectXpath("//test", contextNode);
        assertNotNull(nodeList);
    }

}