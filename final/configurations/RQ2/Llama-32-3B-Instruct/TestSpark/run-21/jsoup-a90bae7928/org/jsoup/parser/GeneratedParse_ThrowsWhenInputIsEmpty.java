package org.jsoup.parser;

public class GeneratedParse_ThrowsWhenInputIsEmpty {

    private static String baseUri = "https://example.com";

    public void testParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        Document document = builder.parse(input, baseUri);
        Assert.assertNotNull(document);
    }

    @Test
    public void parse_ThrowsWhenInputIsEmpty() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("");
        Assert.assertThrows(InvalidXmlException.class, () -> builder.parse(input, "https://example.com"));
    }

}