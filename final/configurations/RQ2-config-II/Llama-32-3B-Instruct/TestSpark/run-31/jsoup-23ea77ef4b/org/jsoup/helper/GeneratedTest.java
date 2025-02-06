package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Document doc;

    @Mock
    private Node node;

    @Before
    public void setup() {
        // Setup is not needed as per the requirements.
    }

    @Test
    public void namespaceAware_ReturnsTrue() {
        boolean result = W3CDom.namespaceAware();
        assertTrue(result);
    }

    @Test
    public void namespaceAware_Parameters_ReturnsPassedValue() {
        boolean result = W3CDom.namespaceAware(true);
        assertTrue(result);
    }

    @Test
    public void convert_JsoupToW3CDoc() {
        Document wDoc = W3CDom.convert(doc);
        assertNotNull(wDoc);
    }

    @Test
    public void asString_W3CDocAsXml() {
        String result = W3CDom.asString(doc, null);
        assertTrue(result.contains("<"));
    }

    @Test
    public void asString_W3CDocWithProperties_AsXml() {
        Map<String, String> properties = new HashMap<>();
        properties.put("property1", "value1");
        String result = W3CDom.asString(doc, properties);
        assertTrue(result.contains("<"));
    }

    @Test
    public void OutputHtml_AsXmlDocument() {
        Document wDoc = W3CDom.OutputHtml();
        assertNotNull(wDoc);
    }

    @Test
    public void OutputXml_AsW3CXMLDocument() {
        Document wDoc = W3CDom.OutputXml();
        assertNotNull(wDoc);
    }

    @Test
    public void fromJsoup_DocumentToW3CDoc() {
        Document wDoc = W3CDom.fromJsoup(doc);
        assertNotNull(wDoc);
    }

    @Test
    public void fromJsoup_ElementToW3CDoc() {
        Element element = new Element();
        Document wDoc = W3CDom.fromJsoup(element);
        assertNotNull(wDoc);
    }

    @Test
    public void convert_DocumentToW3CDoc() {
        Document out = new Document();
        W3CDom.convert(doc, out);
        assertNotNull(out);
    }

    @Test
    public void convert_ElementToW3CDoc() {
        Element element = new Element();
        Document out = new Document();
        W3CDom.convert(element, out);
        assertNotNull(out);
    }

    @Test
    public void selectXpath_XPathWithDocumentContext_ReturnsNodesList() {
        NodeList nodesList = W3CDom.selectXpath("/xpath", doc);
        assertNotNull(nodesList);
    }

    @Test
    public void selectXpath_XPathWithoutDocumentContext_ReturnsEmptyList() {
        NodeList nodesList = W3CDom.selectXpath("/xpath", null);
        assertTrue(nodesList.isEmpty());
    }

    @Test
    public void sourceNodes_DocumentNodeListOfNodeType_ReturnsList() {
        List<Node> nodesList = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(nodesList);
    }

    @Test
    public void sourceNodes_EmptyDocumentNodeListOfNodeType_ReturnsEmptyList() {
        List<Node> nodesList = W3CDom.sourceNodes(new ArrayList<>(), Node.class);
        assertTrue(nodesList.isEmpty());
    }

    @Test
    public void contextNode_Document

    ReturnsContextNode() {
        Node node = W3CDom.contextNode(doc);
        assertNotNull(node);
    }

    @Test
    public void asString_W3CDoc_AsString() {
        String result = W3CDom.asString(doc, null);
        assertTrue(result.contains("<"));
    }

}