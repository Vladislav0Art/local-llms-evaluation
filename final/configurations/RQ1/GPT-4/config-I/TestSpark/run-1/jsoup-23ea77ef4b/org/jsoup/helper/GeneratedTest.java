package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    private static final String SOME_HTML = "<html><head><title>First parse</title></head><body><p>Parsed HTML into a doc.</p></body></html>";

    @Test
    public void namespaceAwareTest() {
        W3CDom dom = new W3CDom();
        assertTrue(dom.namespaceAware());

        dom.namespaceAware(false);
        assertFalse(dom.namespaceAware());

        dom.namespaceAware(true);
        assertTrue(dom.namespaceAware());
    }

    @Test
    public void convertTest() {
        Element element = Jsoup.parse(SOME_HTML);
        Document result = W3CDom.convert(element.ownerDocument());

        assertNotNull(result);
        assertEquals("First parse", result.getElementsByTagName("title").item(0).getTextContent());
    }

    @Test
    public void fromJsoupTest() {
        Element element = Jsoup.parse(SOME_HTML);
        W3CDom dom = new W3CDom();
        Document result = dom.fromJsoup(element.ownerDocument());

        assertNotNull(result);
        assertEquals("First parse", result.getElementsByTagName("title").item(0).getTextContent());
    }

    @Test
    public void convertWithDocumentTest() throws ParserConfigurationException {
        Element element = Jsoup.parse(SOME_HTML);
        W3CDom dom = new W3CDom();

        Document result = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        dom.convert(element.ownerDocument(), result);

        assertNotNull(result);
        assertEquals("First parse", result.getElementsByTagName("title").item(0).getTextContent());
    }

    @Test
    public void asStringTest() throws IOException, ParserConfigurationException {
        Element element = Jsoup.parse(SOME_HTML);
        W3CDom dom = new W3CDom();
        Document document = dom.fromJsoup(element.ownerDocument());
        String result = dom.asString(document);
        assertTrue(result.contains("<title>First parse</title>"));
    }

    @Test
    public void selectXpathInvalidInputTest() {
        W3CDom dom = new W3CDom();
        try {
            dom.selectXpath(null, null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Parameter 'xpath' is required", e.getMessage());
        }
    }

    @Test
    public void sourceNodesTest() throws ParserConfigurationException {
        Element element = Jsoup.parse(SOME_HTML);
        W3CDom dom = new W3CDom();
        Document document = dom.fromJsoup(element.ownerDocument());
        NodeList nodeList = document.getElementsByTagName("p");
        assertTrue(nodeList.getLength() > 0);
    }

}