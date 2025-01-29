package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestSourceNodes {

    @Test
    public void testSourceNodes() {
        W3CDom doc = new W3CDom();

        List<Node> list = new ArrayList<>();
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document();
        Node node = new org.jsoup.nodes.Element(document1);
        list.add(node);

        Document doc2 = new org.jsoup.nodes.Document();
        String xpath = "/html/body";
        Selector selector = new org.jsoup.select.Selector(xpath, null);
        NodeList nodeList = doc2.selectXpath(xpath, selector);
        list.add(nodeList);

        Node contextNode = new org.jsoup.nodes.Document(document1);
        list.add(contextNode);

        assertTrue(doc.sourceNodes(list, org.jsoup.nodes.Node.class).isEmpty());
    }

}