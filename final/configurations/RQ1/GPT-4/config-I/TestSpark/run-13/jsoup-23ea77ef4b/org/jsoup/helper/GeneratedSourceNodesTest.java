package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Test</p></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDom.selectXpath("//p", w3cDoc);
        List<org.jsoup.nodes.Node> sourceNodes = w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, sourceNodes.size());
    }

}