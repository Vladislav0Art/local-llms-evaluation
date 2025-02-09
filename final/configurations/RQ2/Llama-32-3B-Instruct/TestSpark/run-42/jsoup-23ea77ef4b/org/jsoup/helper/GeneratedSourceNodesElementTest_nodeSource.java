package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesElementTest_nodeSource {

    @Test
    public void sourceNodesElementTest_nodeSource() {
        Document doc = new org.jsoup.nodes.Document();
        NodeList nodeList = doc.getElementsByTagName("div");
        List<org.jsoup.nodes.Node> nodes = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Element.class);
        assertEquals(1, nodes.size());
    }

}