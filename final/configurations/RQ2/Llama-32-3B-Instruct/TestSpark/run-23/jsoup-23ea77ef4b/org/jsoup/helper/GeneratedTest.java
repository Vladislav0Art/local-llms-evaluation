package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void namespaceAware_ReturnsBoolean() {
        boolean result = W3CDom.namespaceAware();
        Assert.assertTrue(result);
    }

    @Test
    public void namespaceAware_ReturnsNull() {
        W3CDom namespaceAware = new W3CDom();
        boolean result = namespaceAware.namespaceAware(false);
        Assert.assertFalse(result);
    }

    @Test
    public void convert_PassesFromJsoupDocument() {
        Document soup = Document.create("html");
        Document dom = W3CDom.convert(soup);
        Assert.assertNotNull(dom);
    }

    @Test
    public void asString_ReturnsStringFromDocument() {
        String result = W3CDom.asString(Document.create("html"));
        Assert.assertNotNull(result);
    }

    @Test
    public void propertiesFromMap_ReturnsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties result = W3CDom.propertiesFromMap(map);
        Assert.assertNotNull(result);
    }

    @Test
    public void OutputHtml_ReturnsHashMap() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        Assert.assertNotNull(result);
    }

    @Test
    public void OutputXml_ReturnsHashMap() {
        HashMap<String, String> result = W3CDom.OutputXml();
        Assert.assertNotNull(result);
    }

    @Test
    public void fromJsoup_PassesFromJsoupDocument() {
        Document soup = Document.create("html");
        Document dom = W3CDom.fromJsoup(soup);
        Assert.assertNotNull(dom);
    }

    @Test
    public void fromJsoup_PassesFromJsoupElement() {
        Document soup = Document.create("html");
        Element element = soup.createElement("div");
        Document dom = W3CDom.fromJsoup(element);
        Assert.assertNotNull(dom);
    }

    @Test
    public void convert_PassesConversion() {
        Document soup = Document.create("html");
        Document dom = W3CDom.convert(soup);
        dom.appendChild(soup.importNode(soup.getElementsByTagName("body").item(0), true));
        Assert.assertTrue(W3CDom.convert(soup).contains(dom));
    }

    @Test
    public void selectXpath_ReturnsListFromDom() {
        Document soup = Document.create("html");
        Element element = soup.createElement("div");
        soup.appendChild(element);
        NodeList result = W3CDom.selectXpath("//div", soup);
        Assert.assertNotNull(result);
    }

    @Test
    public void contextNode_ReturnsDocument() {
        Document wDoc = Document.create("html");
        Document result = W3CDom.contextNode(wDoc);
        Assert.assertNotNull(result);
    }

    @Test
    public void asString_ReturnsStringFromDom() {
        Document doc = Document.create("html");
        String result = W3CDom.asString(doc);
        Assert.assertNotNull(result);
    }

}