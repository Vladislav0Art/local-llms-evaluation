package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        final org.jsoup.nodes.Document document = Jsoup.parse("<html><head></head><body><div></div></body></html>");
        final W3CDom w3CDom = new W3CDom();
        final Document w3CDomDocument = w3CDom.fromJsoup(document);
        final NodeList nodeList = w3CDom.selectXpath("//div", w3CDomDocument);

        final List<Node> nodes = w3CDom.sourceNodes(nodeList, Node.class);
        assertFalse(nodes.isEmpty());
    }

}