package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTest {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Test
    public void namespaceAware_testTrue() {
        when(documentBuilder.getImplementation()).thenReturn(Mockito.mock(DOMImplementation.class));
        assertTrue(new W3CDom().namespaceAware());
    }

    @Test
    public void namespaceAware_testFalse() {
        when(documentBuilder.getImplementation()).thenReturn(Mockito.mock(DOMImplementation.class));
        assertFalse(new W3CDom().namespaceAware(false));
    }

    @Test
    public void fromJsoup_document_testSuccess() {
        Document document = Mockito.mock(Document.class);
        Element element = new Element();
        when(element.getDocumentType()).thenReturn(document);
        assertEquals(document, new W3CDom().fromJsoup(element));
    }

    @Test
    public void convert_doc_toDoc_testSuccess() {
        Document in = Mockito.mock(Document.class);
        Document out = Mockito.mock(Document.class);
        when(documentBuilder.newDocumentBuilder()).thenReturn(out);
        new W3CDom().convert(in, out);
    }

    @Test
    public void selectXpath_xpath_testSuccess() {
        String xpath = "test";
        Node contextNode = Mockito.mock(Node.class);
        NodeList nodeList = new ArrayList<>();
        when(contextNode.getNodeList(Mockito.any(String.class))).thenReturn(nodeList);
        assertEquals(nodeList, new W3CDom().selectXpath(xpath, contextNode));
    }

    @Test
    public void sourceNodes_nodeList_testSuccess() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<Node> nodes = new ArrayList<>();
        when(nodeList.getLength()).thenReturn(nodes.size());
        assertEquals(nodes, new W3CDom().sourceNodes(nodeList, Node.class));
    }

    @Test
    public void asString_doc_testSuccess() {
        Document document = Mockito.mock(Document.class);
        String result = "test";
        when(document.toString(Mockito.any(String.class))).thenReturn(result);
        assertEquals(result, new W3CDom().asString(document));
    }

}