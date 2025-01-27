package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedSourceNodesNodeList {

    @Test
    public void sourceNodesNodeList() {
        NodeList nodeList = new org.jsoup.nodes.NodeList();
        when(org.jsoup.nodes.Document.select("xpath")).thenReturn(nodeList);
        List<Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(1, result.size());
    }

}