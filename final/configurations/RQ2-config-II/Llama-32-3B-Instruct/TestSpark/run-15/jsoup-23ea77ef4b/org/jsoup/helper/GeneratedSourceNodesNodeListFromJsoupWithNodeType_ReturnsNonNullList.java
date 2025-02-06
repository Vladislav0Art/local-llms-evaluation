package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeList;
import org.w3c.dom.DocumentType;

public class GeneratedSourceNodesNodeListFromJsoupWithNodeType_ReturnsNonNullList {

    @Test
    public void sourceNodesNodeListFromJsoupWithNodeType_ReturnsNonNullList() {
        NodeList nodeList = new NodeList();
        List<Node> selectedNodes = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(selectedNodes);
    }

}