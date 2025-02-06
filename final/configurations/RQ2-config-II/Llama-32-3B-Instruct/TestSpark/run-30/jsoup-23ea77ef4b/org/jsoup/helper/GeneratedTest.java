package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    private W3CDom w3cdom = new W3CDom();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void namespaceAware_[
    ReturnsTrueWhenNamespaceAwareIsTrue]

    Test() {
        when(documentBuilderFactory.newDocumentBuilder()).thenReturn(documentBuilder);
        assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAware_[
    ReturnsFalseWhenNamespaceAwareIsFalse]

    Test() {
        when(documentBuilderFactory.newDocumentBuilder()).thenReturn(documentBuilder);
        assertFalse(w3cdom.namespaceAware(false));
    }

    @Test
    public void namespaceAware_[
    ReturnsTrueWhenNoNamespaceAware]

    Test() {
        when(documentBuilderFactory.newDocumentBuilder()).thenReturn(documentBuilder);
        assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void fromJsoup_[
    ConvertsFromJsoup]

    Test() {
        Document document = w3cdom.fromJsoup(new Document());
        assertNotNull(document);
    }

    @Test
    public void fromJsoup_[
    ConvertsFromElement]

    Test() {
        Element element = new Element();
        Document document = w3cdom.fromJsoup(element);
        assertNotNull(document);
    }

    @Test
    public void asString_[
    ReturnsAsStringWithProperties]

    Test() {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String string = w3cdom.asString(new Document(), properties);
        assertNotNull(string);
        assertTrue(string.contains("value"));
    }

    @Test
    public void asString_[
    ReturnsAsStringWithoutProperties]

    Test() {
        Map<String, String> properties = new HashMap<>();
        String string = w3cdom.asString(new Document(), null);
        assertNotNull(string);
    }

    @Test
    public void OutputHtml_[
    ConvertsToHtml]

    Test() {
        List<String> outputHtml = w3cdom.OutputHtml();
        assertNotNull(outputHtml);
        assertTrue(outputHtml.contains("<html>"));
    }

    @Test
    public void OutputXml_[
    ConvertsToXml]

    Test() {
        List<String> outputXml = w3cdom.OutputXml();
        assertNotNull(outputXml);
        assertTrue(outputXml.contains("<xml>"));
    }

    @Test
    public void convert_[
    ConvertsFromJsoupToW3CDom]

    Test() {
        Document document = new Document();
        Document out = w3cdom.convert(new Document(), document);
        assertNotNull(out);
    }

    @Test
    public void convert_[
    ConvertsFromElementToW3CDom]

    Test() {
        Element element = new Element();
        Document out = w3cdom.convert(element, new Document());
        assertNotNull(out);
    }

    @Test
    public void selectXpath_[
    SelectsWithXPATH]

    Test() {
        NodeList nodeList = w3cdom.selectXpath("xpath", new Document());
        assertNotNull(nodeList);
        assertTrue(nodeList.size() > 0);
    }

    @Test
    public void selectXpath_[
    SelectsWithXPATHAndContextNode]

    Test() {
        Node contextNode = w3cdom.contextNode(new Document());
        NodeList nodeList = w3cdom.selectXpath("xpath", contextNode);
        assertNotNull(nodeList);
        assertTrue(nodeList.size() > 0);
    }

    @Test
    public void sourceNodes_[
    ReturnsSourceNodes]

    Test() {
        List<String> outputHtml = w3cdom.OutputHtml();
        Node node = w3cdom.sourceNodes(new NodeList(), String.class);
        assertNotNull(node);
        assertTrue(node instanceof org.jsoup.nodes.Text);
    }

    @Test
    public void contextNode_[
    ReturnsContextNode]

    Test() {
        Document document = new Document();
        Node contextNode = w3cdom.contextNode(document);
        assertNotNull(contextNode);
        assertTrue(contextNode instanceof Element);
    }

    @Test
    public void asString_[
    ReturnsAsStringWithDocument]

    Test() {
        Document document = new Document();
        String string = w3cdom.asString(document);
        assertNotNull(string);
        assertTrue(string.contains("<html>"));
    }

}