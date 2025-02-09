package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedSourceNodes_FromNodeList {

    @Test
    public void sourceNodes_FromNodeList() throws Exception {
        NodeList nodeList = new NodeList();
        List<Node> expected = new ArrayList<>();
        expected.add(new Node());
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(expected, result);
    }

}