package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() throws ParserConfigurationException {
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf("p"), "");
        W3CDom w3CDom = new W3CDom();
        Document document = w3CDom.fromJsoup(element);
        NodeList nodeList = w3CDom.selectXpath("//p", document);
        List<org.jsoup.nodes.Node> sourceNodes = w3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, sourceNodes.size());
    }

}