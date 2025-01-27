package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Document document;

    @Mock
    private Element element;

    @InjectMocks
    private W3CDom w3cDom;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void namespaceAware_ShouldReturnFalse_WhenNamespaceAwareIsFalse() {
        when(w3cDom.namespaceAware()).thenReturn(false);
        boolean result = w3cDom.namespaceAware();
        assertEquals(false, result);
    }

    @Test
    public void namespaceAware_ShouldReturnTrue_WhenNamespaceAwareIsTrue() {
        when(w3cDom.namespaceAware()).thenReturn(true);
        boolean result = w3cDom.namespaceAware();
        assertEquals(true, result);
    }

    @Test
    public void fromJsoupocument_ShouldReturnDocument_WhenDocumentIsPassed() {
        when(document.getDocumentElement()).thenReturn(element);
        Document result = w3cDom.fromJsoup(document);
        assertNotNull(result);
        assertEquals(element, result.getDocumentElement());
    }

    @Test
    public void fromJsoupelement_ShouldReturnDocument_WhenElementIsPassed() {
        when(element.getOwnerDocument()).thenReturn(document);
        Document result = w3cDom.fromJsoup(element);
        assertNotNull(result);
        assertEquals(document, result);
    }

    @Test
    public void fromJsoupdocumentConversion_ShouldConvertDocument_WhenDocumentIsPassed() {
        when(document.getDocumentElement()).thenReturn(element);
        Document convertedDocument = w3cDom.fromJsoup(document);
        Document expectedConvertedDocument = convertFromXmlToSoup(convertedDocument);
        assertEquals(expectedConvertedDocument, convertedDocument);
    }

    @Test
    public void fromJsoupelementConversion_ShouldConvertElement_WhenElementIsPassed() {
        when(element.getOwnerDocument()).thenReturn(document);
        Document convertedDocument = w3cDom.fromJsoup(element);
        Document expectedConvertedDocument = convertFromXmlToSoup(convertedDocument);
        assertEquals(expectedConvertedDocument, convertedDocument);
    }

    @Test
    public void outputHtml_ShouldReturnHtml_WhenOutputHtmlIsCalled() {
        when(w3cDom.toXml(document)).thenReturn("<html><body>test</body></html>");
        String html = w3cDom.OutputHtml();
        assertEquals("<html><body>test</body></html>", html);
    }

    @Test
    public void outputXml_ShouldReturnXml_WhenOutputXmlIsCalled() {
        when(w3cDom.toXml(document)).thenReturn("<html><body>test</body></html>");
        String xml = w3cDom.OutputXml();
        assertEquals("<html><body>test</body></html>", xml);
    }

    @Test
    public void contextNode_ShouldReturnContextNode_WhenDocumentIsPassed() {
        when(document.getDocumentElement()).thenReturn(element);
        Node result = w3cDom.contextNode(document);
        assertNotNull(result);
        assertEquals(element, result);
    }

    @Test
    public void sourceNodes_EmptyList_ShouldReturnEmptyList_WhenNoNodesAreFound() {
        NodeList nodeList = new NodeList();
        List<Node> nodes = w3cDom.sourceNodes(nodeList, Node.class);
        assertTrue(nodes.isEmpty());
    }

    private Document convertFromXmlToSoup(Document document) {
        // implementation
        return null;
    }

}