package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private W3CDom w3cdom;

    @Mock
    private Document document;

    @Mock
    private Element element;

    @Test
    public void namespaceAwareTrue() {
        boolean result = w3cdom.namespaceAware();
        assertTrue(result);
    }

    @Test
    public void namespaceAwareFalse() {
        when(w3cdom.namespaceAware()).thenReturn(false);
        boolean result = w3cdom.namespaceAware();
        assertFalse(result);
    }

    @Test
    public void convertDocument() {
        Document result = W3CDom.convert(document);
        assertNotNull(result);
    }

    @Test
    public void asStringProperties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String result = W3CDom.asString(document, properties);
        assertEquals("value", result);
    }

    @Test
    public void OutputHtml() {
        Map<String, String> map = new HashMap<>();
        map.put("method", "html");
        HashMap<String, String> result = W3CDom.OutputHtml(map);
        assertNotNull(result);
        assertTrue(result.containsKey("method"));
    }

    @Test
    public void OutputXml() {
        Map<String, String> map = new HashMap<>();
        map.put("method", "xml");
        HashMap<String, String> result = W3CDom.OutputXml(map);
        assertNotNull(result);
        assertTrue(result.containsKey("method"));
    }

    @Test
    public void fromJsoupDocument() {
        Document result = w3cdom.fromJsoup(document);
        assertNotNull(result);
    }

    @Test
    public void fromJsoupElement() {
        NodeVisitor visitor = new NodeVisitor();
        w3cdom.fromJsoup(element, visitor);
        assertEquals(element, visitor.getNode());
    }

    @Test
    public void convertDocument2() {
        Document document1 = new Document();
        Document result = w3cdom.convert(document1);
        assertNotNull(result);
    }

    @Test
    public void contextNodeDocument() {
        when(w3cdom.contextNode(document)).thenReturn(element);
        Node result = w3cdom.contextNode(document);
        assertEquals(element, result);
    }

    @Test
    public void selectXpathStringDocument() {
        NodeList nodeList = new NodeList();
        when(document.getXPathResult(any(), any())).thenReturn(nodeList);
        NodeList result = w3cdom.selectXpath("xpath", document);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void selectXpathStringNode() {
        NodeList nodeList = new NodeList();
        when(element.getXPathResult(any(), any())).thenReturn(nodeList);
        NodeList result = w3cdom.selectXpath("xpath", element);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}