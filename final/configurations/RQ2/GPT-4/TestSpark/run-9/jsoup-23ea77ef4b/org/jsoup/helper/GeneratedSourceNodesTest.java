package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("", new Document(""));
        List<org.jsoup.nodes.Node> nodes = w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
    }

}