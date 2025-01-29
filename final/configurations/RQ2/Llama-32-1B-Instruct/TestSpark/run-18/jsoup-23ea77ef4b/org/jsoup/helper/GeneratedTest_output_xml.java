package org.jsoup.helper;

public class GeneratedTest_output_xml {

    @MethodUnderTest
    private static Document convert(org.jsoup.nodes.Document in) {
        return in;
    }

    @MethodUnderTest
    private static String asString(Document doc, @Nullable Map<String, String> properties) {
        return (properties == null || properties.isEmpty()) ? "" : String.join(", ", properties.keySet());
    }

    @Test
    public void test_output_xml() {
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        Assert.assertEquals(OutputXml(), doc);
    }

    @MethodUnderTest
    private static HashMap<String, String> OutputXml() {
        return new HashMap<>();
    }

    @MethodUnderTest
    public void test_output_xml() {
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        Assert.assertEquals(OutputXml(), doc);
    }

}