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
public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        Assert.assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareIsTrueTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        Assert.assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void convertDocumentToW3cTest() throws ParserConfigurationException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document actual = W3CDom.convert(jsoupDoc);
        Assert.assertNotNull(actual);
    }

    @Test
    public void asStringFromDocWithPropertiesTest() {
        org.w3c.dom.Document doc = new W3CDom().fromJsoup(new Document(""));
        Map<String, String> properties = new HashMap<>();
        String actual = W3CDom.asString(doc, properties);
        Assert.assertNotNull(actual);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        Properties properties = W3CDom.propertiesFromMap(map);
        Assert.assertNotNull(properties);
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> output = W3CDom.OutputHtml();
        Assert.assertNotNull(output);
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> output = W3CDom.OutputXml();
        Assert.assertNotNull(output);
    }

    @Test
    public void fromJsoupDocumentTest() throws ParserConfigurationException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document actual = new W3CDom().fromJsoup(jsoupDoc);
        Assert.assertNotNull(actual);
    }

    @Test
    public void fromJsoupElementTest() throws ParserConfigurationException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document actual = new W3CDom().fromJsoup(jsoupDoc);
        Assert.assertNotNull(actual);
    }

    @Test
    public void selectXpathInDocumentTest() throws ParserConfigurationException, XPathExpressionException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document doc = new W3CDom().fromJsoup(jsoupDoc);
        NodeList nodeList = new W3CDom().selectXpath("//*", doc);
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void selectXpathInNodeContextTest() throws ParserConfigurationException, XPathExpressionException {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document doc = new W3CDom().fromJsoup(jsoupDoc);
        org.w3c.dom.Node contextNode = doc.getFirstChild();
        NodeList nodeList = new W3CDom().selectXpath("//*", contextNode);
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void asStringFromDocumentTest() {
        org.w3c.dom.Document doc = new W3CDom().fromJsoup(new Document(""));
        String actual = new W3CDom().asString(doc);
        Assert.assertNotNull(actual);
    }

}