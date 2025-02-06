package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedSourceNodes_node_list {

    @Test
    public void sourceNodes_node_list() {
        NodeList nodeList = new ArrayList<>();
        nodeList.add(new Element("element1"));
        nodeList.add(new Element("element2"));
        List<Node> expected = new ArrayList<>();
        expected.add((Node) nodeList.get(0));
        expected.add((Node) nodeList.get(1));
        assertEquals(expected, W3CDom.sourceNodes(nodeList, Node.class));
    }

}