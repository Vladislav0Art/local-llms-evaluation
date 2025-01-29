package org.jsoup.helper;

public class GeneratedTest_convertJsoupToDom {

    @MethodUnderTest
    private static Document convert(org.jsoup.nodes.Document in) {
        return in;
    }

    @MethodUnderTest
    private static String asString(Document doc, @Nullable Map<String, String> properties) {
        return (properties == null || properties.isEmpty()) ? "" : String.join(", ", properties.keySet());
    }

    @Test
    public void test_convertJsoupToDom() {
        Document in = org.jsoup.nodes.Document.parse("http://example.com");
        Document out = W3CDom.convert(in);
        Assert.assertEquals(in, out);
    }

    @MethodUnderTest
    private static HashMap<String, String> OutputHtml() {
        return new HashMap<>();
    }

    @MethodUnderTest
    public void test_output_html() {
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        Assert.assertEquals(OutputHtml(), doc);
    }

}