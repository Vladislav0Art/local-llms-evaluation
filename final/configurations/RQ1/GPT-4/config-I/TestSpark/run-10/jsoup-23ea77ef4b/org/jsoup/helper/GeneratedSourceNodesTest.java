package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document convertedDoc = W3CDom.convert(document);
        NodeList nodeList = w3cDom.selectXpath("/", convertedDoc);
        assertNotEquals(0, w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class).size());
    }

}