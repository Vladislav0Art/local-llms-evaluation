package org.jsoup.helper;

public class GeneratedConvertConvertsDocument {

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
    public void convertConvertsDocument() throws Exception {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new java.io.ByteArrayInputStream("xml".getBytes()));
        Document expected = documentBuilder.parse(document.getXml());
        W3CDom.convert(Document::new, document);
        org.junit.Assert.assertEquals(expected, Document::new);
    }

}