package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSourceNodesWorksCorrectNodes {

    @Test
    public void sourceNodesWorksCorrectNodes() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodes = W3CDom.sourceNodes(doc.childNodes(), org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
        assertTrue(nodes instanceof NodeList);
    }

}