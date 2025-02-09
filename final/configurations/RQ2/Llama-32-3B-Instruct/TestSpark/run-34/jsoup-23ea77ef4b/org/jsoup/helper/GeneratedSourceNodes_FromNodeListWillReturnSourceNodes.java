package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedSourceNodes_FromNodeListWillReturnSourceNodes {

    @Test
    public void sourceNodes_FromNodeListWillReturnSourceNodes() {
        NodeList nodeList = new DOMBuilder().build("<root><child>Child content</child></root>");
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(result);
        assertEquals(2, result.size());
    }

}