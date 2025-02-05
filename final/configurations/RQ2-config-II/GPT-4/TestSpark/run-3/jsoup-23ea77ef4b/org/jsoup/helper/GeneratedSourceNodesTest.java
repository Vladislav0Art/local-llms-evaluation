package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        NodeList nodeList = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument().getElementsByTagName("*");
        W3CDom instance = new W3CDom();
        List<org.jsoup.nodes.Node> result = instance.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(result);
    }

}