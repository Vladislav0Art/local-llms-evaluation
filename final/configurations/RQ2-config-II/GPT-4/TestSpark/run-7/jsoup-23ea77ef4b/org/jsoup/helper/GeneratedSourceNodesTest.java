package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        W3CDom w3CDom = new W3CDom();
        List<org.jsoup.nodes.Node> nodes = w3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
    }

}