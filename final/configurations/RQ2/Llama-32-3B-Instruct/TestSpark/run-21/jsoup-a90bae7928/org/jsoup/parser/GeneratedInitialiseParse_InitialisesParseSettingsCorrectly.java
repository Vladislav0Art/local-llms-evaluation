package org.jsoup.parser;

public class GeneratedInitialiseParse_InitialisesParseSettingsCorrectly {

    private static String baseUri = "https://example.com";

    public void testParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        Document document = builder.parse(input, baseUri);
        Assert.assertNotNull(document);
    }

    @Test
    public void initialiseParse_InitialisesParseSettingsCorrectly() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        baseUri = "https://example.com";
        Parser parser = new Parser();
        builder.initialiseParse(input, baseUri, parser);
    }

}