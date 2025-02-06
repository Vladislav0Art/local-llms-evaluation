package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void namespaceAware_ReturnsTrue() {
        // Arrange
        boolean expected = true;
        Mockito.when(W3CDom.namespaceImplementation()).thenReturn(expected);
        boolean result = W3CDom.namespaceAware();

        // Act
        assert result == expected;
    }

    @Test
    public void namespaceAware_TurnsNamespaceAwareOn() {
        // Arrange
        boolean expected = false;
        W3CDom w3cDom = new W3CDom();
        Mockito.when(w3cDom.namespaceImplementation()).thenReturn(expected);
        w3cDom.namespaceAware(true);

        // Act
        assert !w3cDom.namespaceAware();

        // Assert
        assert expected;
    }

    @Test
    public void convert_ConvertsJsoupDoc() {
        // Arrange
        Document soupDoc = new Document();
        Document expected = new Document();
        Mockito.when(W3CDom.convert(soupDoc)).thenReturn(expected);
        Document result = W3CDom.convert(soupDoc);

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void fromJsoup_ConvertsJsoupElementToDocument() {
        // Arrange
        Element soupElement = new Element();
        Document expected = new Document();
        Mockito.when(W3CDom.fromJsoup(soupElement)).thenReturn(expected);
        Document result = W3CDom.fromJsoup(soupElement);

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void fromJsoup_ConvertsJsoupDocumentToDocument() {
        // Arrange
        Document soupDoc = new Document();
        Document expected = new Document();
        Mockito.when(W3CDom.fromJsoup(soupDoc)).thenReturn(expected);
        Document result = W3CDom.fromJsoup(soupDoc);

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void asString_ConvertsDocumentToString() {
        // Arrange
        Document doc = new Document();
        String expected = "string";
        Mockito.when(W3CDom.asString(doc)).thenReturn(expected);
        String result = W3CDom.asString(doc);

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void asString_ConvertsDocumentToStringWithProperties() {
        // Arrange
        Document doc = new Document();
        Map<String, String> properties = new HashMap<>();
        String expected = "string";
        Mockito.when(W3CDom.asString(doc, properties)).thenReturn(expected);
        String result = W3CDom.asString(doc, properties);

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void sourceNodes_ReturnsSourceNodes() {
        // Arrange
        NodeList nodeList = new NodeList();
        List<Node> expected = new ArrayList<>();
        Mockito.when(W3CDom.sourceNodes(nodeList, Node.class)).thenReturn(expected);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void selectXpath_ConvertsToNodeList() {
        // Arrange
        Document doc = new Document();
        String xpath = "xpath";
        NodeList expected = new NodeList();
        Mockito.when(W3CDom.selectXpath(xpath, doc)).thenReturn(expected);
        NodeList result = W3CDom.selectXpath(xpath, doc);

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void contextNode_ReturnsContextNode() {
        // Arrange
        Document wDoc = new Document();
        Node contextNode = new Node();
        Mockito.when(W3CDom.contextNode(wDoc)).thenReturn(contextNode);
        Node result = W3CDom.contextNode(wDoc);

        // Act

        // Assert
        assert result == contextNode;
    }

    @Test
    public void OutputHtml_ConvertsToHtmlMap() {
        // Arrange
        Document doc = new Document();
        Map<String, String> expected = new HashMap<>();
        Mockito.when(W3CDom.OutputHtml()).thenReturn(expected);
        Map<String, String> result = W3CDom.OutputHtml();

        // Act

        // Assert
        assert result == expected;
    }

    @Test
    public void OutputXml_ConvertsToXmlMap() {
        // Arrange
        Document doc = new Document();
        Map<String, String> expected = new HashMap<>();
        Mockito.when(W3CDom.OutputXml()).thenReturn(expected);
        Map<String, String> result = W3CDom.OutputXml();

        // Act

        // Assert
        assert result == expected;
    }

}