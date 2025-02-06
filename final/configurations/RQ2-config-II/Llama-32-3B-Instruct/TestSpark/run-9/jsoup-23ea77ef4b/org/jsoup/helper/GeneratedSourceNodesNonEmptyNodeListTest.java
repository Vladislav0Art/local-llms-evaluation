package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedSourceNodesNonEmptyNodeListTest {

    @Test
    public void sourceNodesNonEmptyNodeListTest() {
        NodeList nodeList = new NodeList();
        nodeList.add(new Node());
        List<Node> result = org.jsoup.helper.W3CDom.sourceNodes(nodeList, Node.class);
        assertFalse(result.size() == 0);
    }

}