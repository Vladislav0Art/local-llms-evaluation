package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedSourceNodes_Works {

    @Test
    public void sourceNodes_Works() {
        NodeList nodeList = new NodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(0, result.size());
    }

}