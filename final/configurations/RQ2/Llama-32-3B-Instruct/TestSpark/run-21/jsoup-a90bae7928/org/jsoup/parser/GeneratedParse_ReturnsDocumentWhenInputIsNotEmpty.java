package org.jsoup.parser;

public class GeneratedParse_ReturnsDocumentWhenInputIsNotEmpty {

    @Test
    public void parse_ReturnsDocumentWhenInputIsNotEmpty() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        Document document = builder.parse(input, "https://example.com");
        Assert.assertNotNull(document);
    }

}