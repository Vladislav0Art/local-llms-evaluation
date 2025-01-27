package org.jsoup.parser;

public class GeneratedDefaultSettings_ReturnsDefaultParseSettings {

    private static String baseUri = "https://example.com";

    public void testParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        Document document = builder.parse(input, baseUri);
        Assert.assertNotNull(document);
    }

    @Test
    public void defaultSettings_ReturnsDefaultParseSettings() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        Assert.assertTrue(settings.getParser().getTagHandler().isPresent());
    }

}