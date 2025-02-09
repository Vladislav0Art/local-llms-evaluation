package org.jsoup.helper;

public class GeneratedReturnsOutputHtml {

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
    public void returnsOutputHtml() {
        W3CDom.OutputHtml outputHtml = new W3CDom.OutputHtml();
        String result = outputHtml.get("output html");
        org.junit.Assert.assertEquals("output html", result);
    }

}