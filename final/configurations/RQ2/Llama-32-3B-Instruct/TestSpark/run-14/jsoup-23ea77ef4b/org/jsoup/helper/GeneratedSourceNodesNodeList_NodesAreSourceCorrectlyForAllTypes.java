package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSourceNodesNodeList_NodesAreSourceCorrectlyForAllTypes {

    @Test
    public void sourceNodesNodeList_NodesAreSourceCorrectlyForAllTypes() {
        NodeList nodeList = new W3Dom().selectXpath("//a", null);
        List<Node> result = W3CDom.sourceNodes(nodeList, Element.class);
        assertTrue(result.size() == 0);

        NodeList nodeList2 = new W3Dom().selectXpath("//p", null);
        List<Node> result2 = W3CDom.sourceNodes(nodeList2, Text.class);
        assertNotNull(result2);
    }

}