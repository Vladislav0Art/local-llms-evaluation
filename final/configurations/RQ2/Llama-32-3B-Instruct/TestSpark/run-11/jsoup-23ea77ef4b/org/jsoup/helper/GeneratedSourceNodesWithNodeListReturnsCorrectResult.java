package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesWithNodeListReturnsCorrectResult {

    @Test
    public void sourceNodesWithNodeListReturnsCorrectResult() {
        NodeList nodeList = new ArrayList<>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        nodeList.add(doc.getDocumentElement());
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, result.size());
    }

}