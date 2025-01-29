package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testNamespaceAware() {
        org.jsoup.nodes.Document doc = new Document();
        assertTrue(org.jsoup.helper.W3CDom.namespaceAware(true));
        org.jsoup.helper.W3CDom.w3cDom(doc);
    }

    @Test
    public void testNamespaceAwareFalse() {
        org.jsoup.nodes.Document doc = new Document();
        assertFalse(org.jsoup.helper.W3CDom.namespaceAware(false));
        org.jsoup.helper.W3CDom.w3cDom(doc);
    }

    @Test
    public void testConvert() {
        org.jsoup.nodes.Document in = new Document();
        org.jsoup.nodes.Document out = org.jsoup.helper.W3CDom.convert(in);
        assertTrue(out.tagName().equals("html"));
        assertEquals(1, out.childNodes.getLength());
    }

    @Test
    public void testAsString() {
        org.jsoup.nodes.Document doc = new Document();
        String result = org.jsoup.helper.W3CDom.asString(doc, null);
        assertEquals("<html>", result);
    }

    @Test
    public void testPropertiesFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "test");
        org.jsoup.nodes.Document doc = new Document();
        String result = org.jsoup.helper.W3CDom.propertiesFromMap(map);
        assertEquals("name=test", result);
    }

    @Test
    public void testOutputHtml() {
        org.jsoup.nodes.Document doc = new Document();
        org.jsoup.helper.W3CDom.OutputHtml(doc, null);
        StringWriter writer = new StringWriter();
        org.jsoup.helper.W3CDom.outputHtml(writer, doc);
        assertEquals("<html><head></head><body>Hello World!</body></html>", writer.toString());
    }

    @Test
    public void testOutputXml() {
        org.jsoup.nodes.Document doc = new Document();
        org.jsoup.helper.W3CDom.OutputXml(doc, null);
        StringWriter writer = new StringWriter();
        org.jsoup.helper.W3CDom.outputXml(writer, doc);
        assertEquals("<html><head></head><body>Hello World!</body></html>", writer.toString());
    }

    @Test
    public void testFromJsoup() {
        org.jsoup.nodes.Document in = new Document();
        String result = org.jsoup.helper.W3CDom.fromJsoup(in);
        org.jsoup.nodes.Document doc = new Document();
        assertEquals(doc, result);
    }

    @Test
    public void testFromJsoupElement() {
        org.jsoup.nodes.Element in = new Element("p");
        String result = org.jsoup.helper.W3CDom.fromJsoup(in);
        org.jsoup.nodes.Document doc = new Document();
        assertEquals(doc, result);
    }

    @Test
    public void selectXpathWithoutContextNode() {
        org.jsoup.nodes.Document doc = new Document();
        NodeList nodeList = org.jsoup.helper.W3CDom.selectXpath("p", doc);
        assertEquals(1, nodeList.getLength());
    }

}