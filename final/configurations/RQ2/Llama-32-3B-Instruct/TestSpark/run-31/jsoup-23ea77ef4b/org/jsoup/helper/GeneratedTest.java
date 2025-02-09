package org.jsoup.helper;

public class GeneratedTest {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    public boolean namespaceAware() {
        return false;
    }

    public static void main(String[] args) {
    }

    @Test
    public void namespaceAwareReturnsFalse() {
        boolean result = namespaceAware();
        org.junit.Assert.assertFalse(result);
    }

    @Test
    public void namespaceAwareSetToTrue() {
        boolean result = namespaceAware(true);
        org.junit.Assert.assertTrue(result);
    }

    @Test
    public void convertConvertsDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        Document expected = documentBuilder.parse(document.getXml());
        W3CDom.convert(Document::new, document);
        org.junit.Assert.assertEquals(expected, Document::new);
    }

    @Test
    public void convertConvertsElement() throws Exception {
        Element element = documentFactory.newDocumentBuilder().parse(new java.io.ByteArrayInputStream("xml".getBytes())).documentElement();
        Document expected = W3CDom.convert(element);
        org.junit.Assert.assertEquals(expected, Document::new);
    }

    @Test
    public void fromJsoupConvertsDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        Document expected = W3CDom.convert(document);
        Document result = W3CDom.fromJsoup(document);
        org.junit.Assert.assertEquals(expected, result);
    }

    @Test
    public void fromJsoupConvertsElement() throws Exception {
        Element element = documentFactory.newDocumentBuilder().parse(new java.io.ByteArrayInputStream("xml".getBytes())).documentElement();
        Document expected = W3CDom.convert(element);
        Document result = W3CDom.fromJsoup(element);
        org.junit.Assert.assertEquals(expected, result);
    }

    @Test
    public void selectXpathSelectsNodesFromDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        // ...
    }

    @Test
    public void returnsOutputHtml() {
        W3CDom.OutputHtml outputHtml = new W3CDom.OutputHtml();
        String result = outputHtml.get("output html");
        org.junit.Assert.assertEquals("output html", result);
    }

    @Test
    public void returnsOutputXml() {
        W3CDom.OutputXml outputXml = new W3CDom.OutputXml();
        String result = outputXml.get("output xml");
        org.junit.Assert.assertEquals("output xml", result);
    }

    @Test
    public void convertsDocumentToElement() {
        // ...
    }

    @Test
    public void returnsElement() {
        Element element = // ...
                org.junit.Assert.assertNotNull(element);
    }

    @Test
    public void returnsString() {
        String string = // ...
                org.junit.Assert.assertNotEquals("", string);
    }

}