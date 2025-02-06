package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedSourceNodesEmptyNodeListTest {

    @Test
    public void sourceNodesEmptyNodeListTest() {
        NodeList nodeList = new NodeList();
        List<Node> result = org.jsoup.helper.W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(result.size() == 0);
    }

}