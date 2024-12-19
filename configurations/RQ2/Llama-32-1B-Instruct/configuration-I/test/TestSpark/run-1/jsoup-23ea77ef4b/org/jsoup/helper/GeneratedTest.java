package org.jsoup.helper;

public class GeneratedTest {

    private org.jsoup.nodes.Document document;

    @Test
    public void namespaceAware() {
        document = org.jsoup.select.Document.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertFalse(W3CDom.namespaceAware());
        assertTrue(W3CDom.namespaceAware(true));
    }

    @Test
    public void namespaceAwareMap() {
        Map<String, String> properties = new HashMap<>();
        properties.put("lang", "en");
        properties.put("charset", "UTF-8");
        document = org.jsoup.select.Document.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertFalse(W3CDom.namespaceAware(properties));
        assertTrue(W3CDom.namespaceAware(Map.of("lang", "en")));
    }

    @Test
    public void convert() {
        document = org.jsoup.select.Document.parse("<html><body>Hello World!</body></html>");
        W3CDom.convert(document, null);
        Document expectedDocument = org.jsoup.select.Document.parse("<html><body>Hello World!</body></html>");
        assertEquals(expectedDocument, W3CDom.fromJsoup(document));
    }

    @Test
    public void convertElement() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        W3CDom.convert(document, null);
        Document expectedDocument = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        assertEquals(expectedDocument, W3CDom.fromJsoup(document));
    }

    @Test
    public void convertJsoupElement() {
        document = org.jsoup.select.Document.parse("Hello World!");
        W3CDom.convert(document, null);
        Document expectedDocument = org.jsoup.select.Document.parse("<p>Hello World!</p>");
        assertEquals(expectedDocument, W3CDom.fromJsoup(document));
    }

    @Test
    public void selectXpath() {
        document = org.jsoup.select.Document.parse("Hello <span>World!</span>");
        NodeList result = W3CDom.selectXpath("s[lang='en']", document);
        assertNotNull(result);
        assertEquals(1, result.size());
        Node contextNode = (Node) result.get(0);
        assertTrue(contextNode instanceof org.jsoup.nodes.Element);
    }

    @Test
    public void selectXpathString() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        NodeList result = W3CDom.selectXpath("s[lang='en']", document);
        assertNotNull(result);
        assertEquals(1, result.size());
        Node contextNode = (Node) result.get(0);
        assertTrue(contextNode instanceof org.jsoup.nodes.Element);
    }

    @Test
    public void sourceNodes() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        List<?> list = W3CDom.sourceNodes((org.jsoup.nodes.NodeList) document, org.jsoup.nodes.Node.class);
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

    @Test
    public void contextNode() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        W3CDom.contextNode(document, null);
        org.jsoup.nodes.Document wDoc = new org.jsoup.select.Document();
        assertEquals(document, W3CDom.fromJsoup(wDoc));
    }

    @Test
    public void asString() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        String result = W3CDom.asString(document);
        assertNotNull(result);
        assertEquals("Hello <span>World!", result);
    }

}