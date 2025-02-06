package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesDocumentTest {

    @Test
    public void sourceNodesDocumentTest() {
        NodeList nodeList = new org.jsoup.internal.Parser().parse("<html><body>Hello World!</body></html>", "html").get(0).selectFirst("body");
        List<org.jsoup.nodes.Node> nodes = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
    }

}