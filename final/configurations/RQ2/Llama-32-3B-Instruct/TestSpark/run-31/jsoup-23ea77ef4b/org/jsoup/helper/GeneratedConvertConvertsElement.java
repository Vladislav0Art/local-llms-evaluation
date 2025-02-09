package org.jsoup.helper;

public class GeneratedConvertConvertsElement {

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
    public void convertConvertsElement() throws Exception {
        Element element = documentFactory.newDocumentBuilder().parse(new java.io.ByteArrayInputStream("xml".getBytes())).documentElement();
        Document expected = W3CDom.convert(element);
        org.junit.Assert.assertEquals(expected, Document::new);
    }

}