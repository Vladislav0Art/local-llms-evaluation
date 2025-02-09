package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesNodeList {

    @Test
    public void sourceNodesNodeList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertTrue(result.size() == 0);
    }

}