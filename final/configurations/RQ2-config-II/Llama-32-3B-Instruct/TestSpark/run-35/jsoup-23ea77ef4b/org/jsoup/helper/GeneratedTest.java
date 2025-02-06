package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Test
    public void namespaceAwareReturnsTrue() {
        boolean expected = true;
        Mockito.when(documentBuilderFactory.newDocumentBuilder()).thenReturn(new DocumentBuilder());
        W3CDom w3cDom = new W3CDom();
        boolean result = w3cDom.namespaceAware();
        assert result == expected;
    }

    @Test
    public void namespaceAwareReturnsFalse() {
        boolean expected = false;
        Mockito.when(documentBuilderFactory.newDocumentBuilder()).thenReturn(new DocumentBuilder());
        W3CDom w3cDom = new W3CDom();
        boolean result = w3cDom.namespaceAware(false);
        assert result == expected;
    }

    @Test
    public void convertConvertsJsoupToDoc() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document();
        Document expected = new Document();
        Document actual = W3CDom.convert(jsoupDoc);
        assert actual == expected;
    }

    @Test
    public void asStringReturnsXmlDocAsStringWithProperties() {
        Document doc = new Document();
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "xml");
        StringWriter output = new StringWriter();
        String result = W3CDom.asString(doc, properties);
        assert result.startsWith("<");
    }

    @Test
    public void fromJsoupConvertsJsoupToDoc() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document();
        Document expected = new Document();
        Document actual = W3CDom.fromJsoup(jsoupDoc);
        assert actual == expected;
    }

    @Test
    public void convertConvertsElementToDoc() {
        org.jsoup.nodes.Element jsoupElement = new org.jsoup.nodes.Element();
        Document expected = new Document();
        Document actual = W3CDom.fromJsoup(jsoupElement);
        assert actual == expected;
    }

    @Test
    public void convertConvertsDocAndElement() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document();
        Element jsoupElement = new org.jsoup.nodes.Element();
        Document expectedDoc = new Document();
        Document expectedElement = new Document();
        W3CDom.w3cDom.convert(jsoupDoc, expectedDoc);
        W3CDom.w3cDom.convert(jsoupElement, expectedElement);
    }

    @Test
    public void selectXpathReturnsNodeList() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        String xpath = "some/xpath";
        Document doc = new Document();
        W3CDom.NodeList actual = W3CDom.selectXpath(xpath, doc);
        assert actual != null;
        Mockito.verify(nodeList).size();
    }

    @Test
    public void selectXpathReturnsNodeListWithContext() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        String xpath = "some/xpath";
        Document doc = new Document();
        Node contextNode = Mockito.mock(Node.class);
        W3CDom.NodeList actual = W3CDom.selectXpath(xpath, contextNode);
        assert actual != null;
        Mockito.verify(nodeList).size();
    }

    @Test
    public void sourceNodesReturnsList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> expectedList = new ArrayList<>();
        expectedList.add(new Node());
        W3CDom.List<Node> actual = W3CDom.sourceNodes(nodeList, Node.class);
        assert actual.get(0) == expectedList.get(0);
    }

    @Test
    public void contextNodeReturnsDocument() {
        Document wDoc = new Document();
        Document expected = wDoc;
        W3CDom.Document actual = W3CDom.contextNode(wDoc);
        assert actual == expected;
    }

    @Test
    public void asStringReturnsHtmlAsString() {
        Document doc = new Document();
        StringWriter output = new StringWriter();
        String result = W3CDom.asString(doc, null);
        assert result.startsWith("<");
    }

    @Test
    public void OutputHtmlReturnsMapWithXmlOutput() {
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("method", "xml");
        W3CDom.HashMap<String, String> actual = W3CDom.OutputHtml();
        assert actual.get(0) == expectedMap.get(0);
    }

    @Test
    public void OutputXmlReturnsMapWithXmlOutput() {
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("method", "xml");
        W3CDom.HashMap<String, String> actual = W3CDom.OutputXml();
        assert actual.get(0) == expectedMap.get(0);
    }

}