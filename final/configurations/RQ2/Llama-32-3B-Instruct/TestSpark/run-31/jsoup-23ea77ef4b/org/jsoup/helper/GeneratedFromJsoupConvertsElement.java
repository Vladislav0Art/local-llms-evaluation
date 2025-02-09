package org.jsoup.helper;

public class GeneratedFromJsoupConvertsElement {

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
    public void fromJsoupConvertsElement() throws Exception {
        Element element = documentFactory.newDocumentBuilder().parse(new java.io.ByteArrayInputStream("xml".getBytes())).documentElement();
        Document expected = W3CDom.convert(element);
        Document result = W3CDom.fromJsoup(element);
        org.junit.Assert.assertEquals(expected, result);
    }

}