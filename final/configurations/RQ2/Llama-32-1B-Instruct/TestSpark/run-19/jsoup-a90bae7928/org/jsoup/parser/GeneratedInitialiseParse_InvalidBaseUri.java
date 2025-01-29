package org.jsoup.parser;

public class GeneratedInitialiseParse_InvalidBaseUri {

    @Test
    public void initialiseParse_InvalidBaseUri() {
        // Arrange
        String input = "<root><child/></root>";
        String baseUri = "invalid";
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