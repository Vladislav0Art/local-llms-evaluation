package org.jsoup.helper;

public class GeneratedReturnsOutputXml {

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
    public void returnsOutputXml() {
        W3CDom.OutputXml outputXml = new W3CDom.OutputXml();
        String result = outputXml.get("output xml");
        org.junit.Assert.assertEquals("output xml", result);
    }

}