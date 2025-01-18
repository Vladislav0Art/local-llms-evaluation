package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSourceNodesNodeListNodeTypeTest {

    @Test
    public void sourceNodesNodeListNodeTypeTest() {
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = null; // Should still work with null input
        List<Document> list = w3cDom.sourceNodes(nodeList, Document.class);
        assertTrue(list instanceof List);
    }

}