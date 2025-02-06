package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesList {

    @Test
    public void sourceNodesList() {
        NodeList nodeList = new NodeTraversor().traverse(htmlDoc.selectXpath("//body", htmlDoc));
        List<Node> nodes = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

}