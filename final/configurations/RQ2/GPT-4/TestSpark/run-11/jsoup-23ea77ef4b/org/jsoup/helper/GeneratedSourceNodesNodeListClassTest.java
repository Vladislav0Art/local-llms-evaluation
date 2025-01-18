package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSourceNodesNodeListClassTest {

    @Test
    public void sourceNodesNodeListClassTest() {
        NodeList nodeList = new NodeList();
        W3CDom w3CDom = new W3CDom();
        List<org.jsoup.nodes.Node> nodes = w3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertTrue(nodes.isEmpty());
    }

}