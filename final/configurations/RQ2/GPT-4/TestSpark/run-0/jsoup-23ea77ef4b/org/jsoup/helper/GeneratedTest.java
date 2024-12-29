package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareParamTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(true);
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void selectXpathDocTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid Document and xpath for testing
    }

    @Test
    public void selectXpathNodeTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid Node and xpath for testing
    }

    @Test
    public void convertDocIncomingDocTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid jsoup Document for testing
    }

    @Test
    public void convertElIncomingDocTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid jsoup Element for testing
    }

    @Test
    public void fromJsoupDocTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid jsoup Document for testing
    }

    @Test
    public void fromJsoupElTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid jsoup Element for testing
    }

    @Test
    public void asStringPropertiesTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid Document and Map<String, String> for testing
    }

    @Test
    public void asStringTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid Document for testing
    }

    @Test
    public void convertDocTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid jsoup Document and w3c Document for testing
    }

    @Test
    public void convertElTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid jsoup Element and w3c Document for testing
    }

    @Test
    public void convertStaticTest() {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document result = W3CDom.convert(jsoupDoc);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Properties props = W3CDom.propertiesFromMap(map);
        assertEquals(2, props.size());
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        assertNotNull(outputXml);
    }

    @Test
    public void sourceNodesTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid NodeList and Class<T> for testing
    }

    @Test
    public void contextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        // use a valid w3c Document for testing
    }

}