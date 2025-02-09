package org.jsoup.helper;

public class GeneratedFromJsoupConvertsDocument {

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
    public void fromJsoupConvertsDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        Document expected = W3CDom.convert(document);
        Document result = W3CDom.fromJsoup(document);
        org.junit.Assert.assertEquals(expected, result);
    }

}