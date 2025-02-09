package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesElement {

    @Test
    public void sourceNodesElement() {
        NodeList nodeList = new ArrayList<>();
        nodeList.add(new org.jsoup.nodes.Element());
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(1, result.size());
    }

}