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

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        Assert.assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        Assert.assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html></html>");
        Document convertedDoc = W3CDom.convert(jsoupDoc);
        Assert.assertNotNull(convertedDoc);
    }

    @Test
    public void asStringTest() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put(OutputKeys.INDENT, "yes");

        Assert.assertTrue(W3CDom.asString(doc, properties).isEmpty());
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("testKey", "testValue");
        Properties properties = W3CDom.propertiesFromMap(map);
        Assert.assertEquals("testValue", properties.getProperty("testKey"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        Assert.assertEquals("html", outputHtml.get(OutputKeys.METHOD));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        Assert.assertEquals("xml", outputXml.get(OutputKeys.METHOD));
    }

    @Test
    public void fromJsoupTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Assert.assertNotNull(w3cDoc);
    }

    @Test
    public void selectXpathTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Test</p></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDom.selectXpath("//p", w3cDoc);
        Assert.assertEquals(1, nodeList.getLength());
    }

    @Test
    public void sourceNodesTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Test</p></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDom.selectXpath("//p", w3cDoc);
        List<org.jsoup.nodes.Node> sourceNodes = w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, sourceNodes.size());
    }

    @Test
    public void contextNodeTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Test</p></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Assert.assertNotNull(w3cDom.contextNode(w3cDoc));
    }

}