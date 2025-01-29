package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private static Document doc;
    private static W3CDom w3cdom;

    @BeforeClass
    public static void init() {
        Properties properties = new Properties();
        // Set up mock properties here
        when(propertiesFromFile()).thenReturn(properties);
        doc = convert(doc, properties);
        w3cdom = new W3CDom();
    }

    @Test
    public void namespaceAware_returnsTrue() {
        assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAware_setters_sets_correct_value() {
        W3CDom.W3CDOM_NAMESPACE_AWARE = true;
        w3cdom = new W3CDom();
        assertFalse(w3cdom.namespaceAware());
        assertNotEquals(true, w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAware_setters_returns_correct_value() {
        W3CDOM_NAMESPACE_AWARE = true;
        w3cdom = new W3CDom();
        when(w3cdom.namespaceAware()).thenReturn(W3CDOM_NAMESPACE_AWARE);
        assertFalse(w3cdom.namespaceAware());
        assertEquals(true, w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAware_setters_sets_correct_value() {
        W3CDOM_NAMESPACE_AWARE = false;
        w3cdom = new W3CDom();
        assertFalse(w3cdom.namespaceAware());
        assertNotEquals(false, w3cdom.namespaceAware());
    }

    @Test
    public void convert_returnsDocumentCorrectType() {
        Document expectedDoc = mock(Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Document.class));
        w3cdom = new W3CDom();
        Document result = w3cdom.convert(doc, expectedDoc);
        assertEquals(expectedDoc, result);
    }

    @Test
    public void convert_sets_correct_document() {
        org.jsoup.nodes.Document docMock = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Document.class));
        W3CDOM w3cdomMock = new W3CDom();
        when(w3cdom).convert(doc, docMock);
        w3cdom = new W3CDom();
        w3cdom.convert(docMock, null);
    }

    @Test
    public void convert_sets_correct_document() {
        org.jsoup.nodes.Document docMock = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Document.class));
        Document result = new W3CDom();
        w3cdom = new W3CDom();
        w3cdom.convert(doc, docMock);
    }

    @Test
    public void convert_selectXpath_returnsNodeListCorrectType() {
        org.jsoup.nodes.Document doc = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdom = new W3CDom();
        NodeList expectedNodes = new ArrayList<>();
        when(w3cdom.selectXpath("xpath", doc)).thenReturn(expectedNodes);
        w3cdom = new W3CDom();
        List<Node> result = w3cdom.convert(doc, null);
        assertEquals(expectedNodes, result);
    }

    @Test
    public void selectXpath_returnsNodeListCorrectType() {
        org.jsoup.nodes.Element inElement = mock(org.jsoup.nodes.Element.class);
        when(inElement).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdom = new W3CDom();
        NodeList expectedNodes = new ArrayList<>();
        when(w3cdom.selectXpath("xpath", inElement)).thenReturn(expectedNodes);
        w3cdom = new W3CDom();
        List<Node> result = w3cdom.convert(inElement, null);
        assertEquals(expectedNodes, result);
    }

    @Test
    public void sourceNodes_returnsListCorrectType() {
        org.jsoup.nodes.Document doc = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdom = new W3CDom();
        List<Node> expectedNodes = new ArrayList<>();
        when(w3cdom.sourceNodes(doc, null)).thenReturn(expectedNodes);
        w3cdom = new W3CDom();
        Node result = w3cdom.convert(null, doc);
        assertEquals(expectedNodes, result);
    }

    @Test
    public void sourceNodes_selectXpath_returnsNodeListCorrectType() {
        org.jsoup.nodes.Document doc = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdom = new W3CDom();
        NodeList expectedNodes = new ArrayList<>();
        when(w3cdom.sourceNodes(doc, "xpath")).thenReturn(expectedNodes);
        w3cdom = new W3CDom();
        Node result = w3cdom.convert(null, null);
        assertEquals(expectedNodes, result);
    }

    @Test
    public void contextNode_returnsDocumentCorrectType() {
        org.jsoup.nodes.Document doc = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdom = new W3CDom();
        Document result = w3cdom.contextNode(null, null);
        assertEquals(doc, result);
    }

    @Test
    public void contextNode_sets_correct_document() {
        org.jsoup.nodes.Document docMock = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdomMock = new W3CDOM();
        when(w3cdom).contextNode(docMock, null);
        w3cdomMock.contextNode(null, null);
    }

    @Test
    public void asString_returnsCorrectType() {
        org.jsoup.nodes.Document doc = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        W3CDOM w3cdom = new W3CDOM();
        String result = w3cdom.asString(null, null);
        assertEquals("expected", result);
    }

    @Test
    public void asString_setsCorrect_document() {
        org.jsoup.nodes.Document docMock = mock(org.jsoup.nodes.Document.class);
        when(doc).fromJsoup(mock(org.jsoup.nodes.Element.class));
        Document expectedDoc = new W3CDOM();
        when(w3cdom).asString(null, null);
        w3cdom = new W3CDOM();
        String result = w3cdom.asString(docMock, null);
        assertEquals(expectedDoc, result);
    }

}