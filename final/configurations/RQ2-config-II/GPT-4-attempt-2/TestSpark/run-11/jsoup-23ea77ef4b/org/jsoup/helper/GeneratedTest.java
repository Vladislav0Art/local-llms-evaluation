package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetAndGetTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(true);
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void convertInputDocumentTest() throws ParserConfigurationException {
        Document inputDocument = new Document("");
        org.w3c.dom.Document outputDocument = W3CDom.convert(inputDocument);
        assertNotNull(outputDocument);
    }

    @Test
    public void asStringFromDocumentTest() throws Exception {
        Document inputDocument = new Document("");
        org.w3c.dom.Document outputDocument = W3CDom.convert(inputDocument);
        String result = W3CDom.asString(outputDocument, null);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("method", "html");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals(properties.getProperty("method"), "html");
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> htmlOutput = W3CDom.OutputHtml();
        assertFalse(htmlOutput.isEmpty());
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> xmlOutput = W3CDom.OutputXml();
        assertFalse(xmlOutput.isEmpty());
    }

    @Test
    public void fromJsoupDocumentTest() throws ParserConfigurationException {
        Document inputDocument = new Document("");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document outputDocument = w3CDom.fromJsoup(inputDocument);
        assertNotNull(outputDocument);
    }

}