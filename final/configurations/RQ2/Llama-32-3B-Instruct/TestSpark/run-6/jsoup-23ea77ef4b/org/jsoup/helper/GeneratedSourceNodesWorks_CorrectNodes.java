package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedSourceNodesWorks_CorrectNodes {

    @Test
    public void sourceNodesWorks_CorrectNodes() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodes = W3CDom.sourceNodes(doc.childNodes(), org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
        assertTrue(nodes instanceof NodeList);
    }

}