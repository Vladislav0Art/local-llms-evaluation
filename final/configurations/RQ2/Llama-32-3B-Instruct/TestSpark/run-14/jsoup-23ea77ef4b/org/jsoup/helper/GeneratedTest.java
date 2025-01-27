package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedTest {

    @Test
    public void namespaceAware_ReturnsTrue() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAware_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

    @Test
    public void convertDocumentFromJsoup_ReturnsNull() {
        Document document = W3CDom.convert(null);
        assertNull(document);
    }

    @Test
    public void asStringDocumentProperties_ReturnsEmptyString() {
        String result = W3CDom.asString(null, null);
        assertEquals("", result);
    }

    @Test
    public void propertiesFromMap_ReturnsNull() {
        Properties properties = W3CDom.propertiesFromMap(null);
        assertNull(properties);
    }

    @Test
    public void OutputHtmlReturnsEmptyMap() {
        Map<String, String> result = W3CDom.OutputHtml();
        assertTrue(result.isEmpty());
    }

    @Test
    public void OutputXmlReturnsEmptyMap() {
        Map<String, String> result = W3CDom.OutputXml();
        assertTrue(result.isEmpty());
    }

    @Test
    public void fromJsoupDocument_ReturnsNull() {
        Document document = W3Dom.documentBuilder().parse(new StringWriter());
        Document out = new W3CDom().convert(document);
        assertNotNull(out);
    }

    @Test
    public void convertElementFromJsoupConvertsElementCorrectly() throws Exception {
        Document document = W3Dom.documentBuilder().parse(new StringWriter());
        Element element = document.getElementById("test");
        Document out = new W3CDom().convert(element);
        assertNotNull(out);
    }

    @Test
    public void selectXpathDocument_XPATHReturnsEmptyList() {
        NodeList result = W3CDom.selectXpath("//*/text()", null);
        assertTrue(result.getLength() == 0);
    }

    @Test
    public void selectXpathContextNode_XPATHReturnsEmptyList() {
        Document document = W3Dom.documentBuilder().parse(new StringWriter());
        Element element = document.getElementById("test");
        NodeList result = W3CDom.selectXpath("//*/text()", element);
        assertTrue(result.getLength() == 0);
    }

    @Test
    public void sourceNodesNodeList_NodesAreSourceCorrectlyForAllTypes() {
        NodeList nodeList = new W3Dom().selectXpath("//a", null);
        List<Node> result = W3CDom.sourceNodes(nodeList, Element.class);
        assertTrue(result.size() == 0);

        NodeList nodeList2 = new W3Dom().selectXpath("//p", null);
        List<Node> result2 = W3CDom.sourceNodes(nodeList2, Text.class);
        assertNotNull(result2);
    }

    @Test
    public void contextNodeDocument_ReturnsNull() {
        Document document = W3Dom.documentBuilder().parse(new StringWriter());
        Document out = new W3CDom().contextNode(document);
        assertNull(out);
    }

    @Test
    public void asStringDocument_ReturnsEmptyStringForEmptyDocument() {
        String result = new W3CDom().asString(null);
        assertEquals("", result);
    }

}