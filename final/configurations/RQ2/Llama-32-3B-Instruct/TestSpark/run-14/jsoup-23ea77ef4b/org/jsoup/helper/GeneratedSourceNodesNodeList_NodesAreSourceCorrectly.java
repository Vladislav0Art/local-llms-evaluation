package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSourceNodesNodeList_NodesAreSourceCorrectly {

    @Test
    public void sourceNodesNodeList_NodesAreSourceCorrectly() {
        NodeList nodeList = new W3Dom().selectXpath("//a", null);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(result.size() == 0);
    }

}