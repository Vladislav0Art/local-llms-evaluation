package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.w3c.domComment;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void namespaceAware() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assert w3cdom.namespaceAware();
    }

    @Test
    public void namespaceAwareNotImplemented() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        // implement namespaceAware method
    }

    @Test
    public void namespaceAwareWithBooleanParameter() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assert !w3cdom.namespaceAware(true);
    }

    @Test
    public void OutputHtml() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assertEquals("default", w3cdom.OutputHtml());
    }

    @Test
    public void OutputXml() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assertEquals("default", w3cdom.OutputXml());
    }

    @Test
    public void fromJsoup() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assert w3cdom.fromJsoup(document);
    }

    @Test
    public void fromJsoupElement() {
        org.jsoup.nodes.Element element = new Element("test");
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assertEquals(w3cdom.fromJsoup(element), element);
    }

    @Test
    public void convert() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assert w3cdom.convert(document, null);
    }

    @Test
    public void selectXpath() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assertEquals(3, w3cdom.selectXpath("test", document));
    }

    @Test
    public void selectXpathContextNode() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        org.jsoup.nodes.Element element = new Element("test");
        w3cdom.contextNode(document);
        assertEquals(element, w3cdom.selectXpath("test", document));
    }

    @Test
    public void sourceNodes() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        List<NodeList> nodeList = new ArrayList<>();
        NodeList list1 = w3cdom.sourceNodes(nodeList, Node.class);
        assertEquals(2, list1.size());
        List<Node> list2 = w3cdom.sourceNodes(nodeList, org.jsoup.nodes.NodeType.Element);
        assertEquals(1, list2.size());
    }

    @Test
    public void convertToString() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        StringWriter writer = new StringWriter();
        w3cdom.convert(document, writer);
        assertEquals(writer.toString(), "default");
    }

}