package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Document doc;

    @Test
    public void namespaceAware_ReturnsTrue_WhenNamespaceAware() {
        boolean result = W3CDom.namespaceAware();
        assertTrue(result);
    }

    @Test
    public void namespaceAware_ReturnsFalse_WhenNotNamespaceAware() {
        boolean result = W3CDom.namespaceAware(false);
        assertFalse(result);
    }

    @Test
    public void convert_DocToString_WhenDocumentIsNotNull() {
        String result = W3CDom.convert(doc).toString();
        assertNotNull(result);
    }

    @Test
    public void asString_DocAsString_WithPropertiesWhenProvided() {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String result = W3CDom.asString(doc, properties);
        assertEquals("doc with key=\"value\"", result);
    }

    @Test
    public void asString_DocAsString_WithoutPropertiesWhenProvided() {
        Map<String, String> properties = new HashMap<>();
        W3CDom.asString(doc, properties);
    }

    @Test
    public void OutputHtml_AsMap_WithKeyAndValuePairs() {
        Map<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.containsKey("key"));
        assertTrue(result.containsKey("value"));
    }

    @Test
    public void OutputXml_AsMap_WithXMLEntitiesAndEntityReferences() {
        Map<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.containsKey("&amp;"));
        assertTrue(result.containsKey("&#x27;"));
    }

    @Test
    public void fromJsoup_Doc_WhenDocumentIsNotNull() {
        org.jsoup.nodes.Document soup = new org.jsoup.nodes.Document();
        W3CDom.fromJsoup(soup).equals(doc);
    }

    @Test
    public void fromJsoup_DocElement_WhenElementIsNotNull() {
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element();
        W3CDom.fromJsoup(element).equals(doc);
    }

    @Test
    public void convert_DocToDocument_WithPropertiesWhenProvided() {
        Map<String, String> properties = new HashMap<>();
        DocumentBuilder builder = Mockito.mock(DocumentBuilderFactory.newInstance());
        when(builder.newDocumentBuilder()).thenReturn(Mockito.mock(DocumentBuilder.class));
        W3CDom.convert(doc, properties);
        assertEquals(1, doc.getImplementation().getDocumentType().getEncoding());
    }

    @Test
    public void convert_DocToDocument_WithoutPropertiesWhenProvided() {
        DocumentBuilder builder = Mockito.mock(DocumentBuilderFactory.newInstance());
        when(builder.newDocumentBuilder()).thenReturn(Mockito.mock(DocumentBuilder.class));
        W3CDom.convert(doc);
        assertEquals(1, doc.getImplementation().getDocumentType().getEncoding());
    }

    @Test
    public void selectXpath_XPathResult_WithNodeList() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        when(nodeList.getLength()).thenReturn(1);
        W3CDom.selectXpath("xpath", doc).equals(nodeList);
    }

    @Test
    public void sourceNodes_NodesourceNodes_WithClassAndNodeType() {
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get(0) instanceof org.jsoup.nodes.Node);
    }

    @Test
    public void contextNode_DocContextNode_WithDocument() {
        Document wDoc = new org.jsoup.nodes.Document();
        W3CDom.contextNode(wDoc).equals(doc);
    }

    @Test
    public void asString_DocAsString_WithoutPropertiesWhenProvided() {
        String result = W3CDom.asString(doc);
        assertNotNull(result);
    }

}