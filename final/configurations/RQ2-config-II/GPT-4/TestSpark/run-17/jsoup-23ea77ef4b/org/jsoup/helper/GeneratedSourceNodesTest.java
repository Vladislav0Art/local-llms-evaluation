package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        NodeList nodeList = W3CDom.convert(new Document("")).getChildNodes();
        List<org.jsoup.nodes.Node> actual = dom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(actual);
    }

}