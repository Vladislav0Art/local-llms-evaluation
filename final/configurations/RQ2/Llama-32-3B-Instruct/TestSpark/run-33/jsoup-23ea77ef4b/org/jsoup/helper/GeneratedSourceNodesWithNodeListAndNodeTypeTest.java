package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesWithNodeListAndNodeTypeTest {

    @Test
    public void sourceNodesWithNodeListAndNodeTypeTest() {
        NodeList nodeList = new org.jsoup.nodes.NodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);

        assertNotNull(result);
    }

}