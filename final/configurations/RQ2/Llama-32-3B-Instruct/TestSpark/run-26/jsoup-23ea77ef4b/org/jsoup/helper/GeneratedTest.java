package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void constructor_Works() {
        new W3CDom();
    }

    @Test
    public void namespaceAware_AffectsConvert() {
        W3CDom w3c = new W3CDom();
        boolean result = w3c.namespaceAware();
        assertTrue(result);
    }

    @Test
    public void namespaceAware_SetCorrectly() {
        W3CDom w3c = new W3CDom();
        w3c.namespaceAware(true);
        assertTrue(w3c.namespaceAware());
    }

    @Test
    public void convert_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        W3CDom w3c = new W3CDom();
        Document out = w3c.convert(doc);
        assertNotNull(out);
    }

    @Test
    public void asString_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMap_AffectsProperties() {
        Map<String, String> map = new HashMap<>();
        Properties props = W3CDom.propertiesFromMap(map);
        assertNotNull(props);
    }

    @Test
    public void OutputHtml_AffectsMap() {
        Map<String, String> map = W3CDom.OutputHtml();
        assertNotNull(map);
    }

    @Test
    public void OutputXml_AffectsMap() {
        Map<String, String> map = W3CDom.OutputXml();
        assertNotNull(map);
    }

    @Test
    public void fromJsoup_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        Document result = W3CDom.fromJsoup(doc);
        assertNotNull(result);
    }

    @Test
    public void fromJsoupElement_AffectsDocument() {
        Document doc = Document.createDocumentBuilder().newDocument();
        Element elem = doc.createElement("div");
        Document result = W3CDom.fromJsoup(elem);
        assertNotNull(result);
    }

    @Test
    public void convert_Works() {
        Document in = Document.createDocumentBuilder().newDocument();
        Document out = new Document();
        W3CDom w3c = new W3CDom();
        w3c.convert(in, out);
        assertEquals(out, w3c.fromJsoup(in));
    }

    @Test
    public void convertElement_Works() {
        Element in = new Element("div");
        Document out = new Document();
        W3CDom w3c = new W3CDom();
        w3c.convert(in, out);
        assertEquals(out, w3c.fromJsoup(in));
    }

    @Test
    public void selectXpath_Works() {
        Document doc = Document.createDocumentBuilder().newDocument();
        NodeList nodeList = W3CDom.selectXpath("div", doc);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathContextNode_Works() {
        Document doc = Document.createDocumentBuilder().newDocument();
        Element elem = doc.createElement("div");
        NodeList nodeList = W3CDom.selectXpath("div", elem);
        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodes_Works() {
        NodeList nodeList = new NodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(0, result.size());
    }

}