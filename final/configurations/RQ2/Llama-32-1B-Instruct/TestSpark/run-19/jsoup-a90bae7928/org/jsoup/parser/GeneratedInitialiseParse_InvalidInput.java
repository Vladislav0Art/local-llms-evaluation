package org.jsoup.parser;

public class GeneratedInitialiseParse_InvalidInput {

    @Test
    public void initialiseParse_InvalidInput() {
        // Arrange
        String input = "<root><child>foo</child>";
        String baseUri = "http://example.com";
        Parser parser = new DefaultParser();

        // Act
        Document document = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(new ParseSettings(), parser);
        try {
            instance.initialiseParse(input, baseUri, parser);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        }

        // Assert
    }

}