package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedSourceNodes_DocumentAndNodeTypeTest {

    @Test
    public void sourceNodes_DocumentAndNodeTypeTest() {
        Document in = new Document();
        NodeList nodeList = new NodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(result);
    }

}