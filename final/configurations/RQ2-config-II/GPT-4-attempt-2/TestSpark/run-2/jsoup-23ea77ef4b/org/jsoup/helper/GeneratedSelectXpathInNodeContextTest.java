package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpathInNodeContextTest {

    @Test
    public void selectXpathInNodeContextTest() throws ParserConfigurationException, XPathExpressionException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document doc = new W3CDom().fromJsoup(jsoupDoc);
        org.w3c.dom.Node contextNode = doc.getFirstChild();
        NodeList nodeList = new W3CDom().selectXpath("//*", contextNode);
        Assert.assertNotNull(nodeList);
    }

}