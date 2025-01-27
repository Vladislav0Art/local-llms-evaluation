package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesWithEmptyNodeListReturnsCorrectResult {

    @Test
    public void sourceNodesWithEmptyNodeListReturnsCorrectResult() {
        NodeList nodeList = new ArrayList<>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(result.isEmpty());
    }

}