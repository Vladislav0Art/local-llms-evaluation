package org.jsoup.parser;

public class GeneratedInitialiseParse_EmptyInput {

    @Test
    public void initialiseParse_EmptyInput() {
        // Arrange
        String input = "";
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