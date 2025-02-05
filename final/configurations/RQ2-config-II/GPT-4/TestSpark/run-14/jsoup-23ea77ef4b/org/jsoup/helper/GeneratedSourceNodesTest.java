package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        Document document = Document.createShell("");
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = w3CDom.selectXpath("//*", document);
        List<org.jsoup.nodes.Node> result = w3CDom.sourceNodes(nodeList, org.jsoup.nodes.Element.class);
        Assert.assertEquals(0, result.size());
    }

}