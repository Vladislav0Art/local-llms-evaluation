package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSourceNodes_NodeListFromNodeType {

    @Test
    public void sourceNodes_NodeListFromNodeType() {
        NodeList nodeList = new org.jsoup.internal.JsoupInternalNodeList();
        List<org.jsoup.nodes.Node> expectedSourceNodes = new ArrayList<>();
        List<org.jsoup.nodes.Node> actualSourceNodes = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(expectedSourceNodes, actualSourceNodes);
    }

}