package org.jsoup.parser;

public class GeneratedInitialiseParse_InvalidParser {

    @Test
    public void initialiseParse_InvalidParser() {
        // Arrange
        String input = "<root><child/></root>";
        String baseUri = "http://example.com";
        Parser parser = new DefaultParser();

        // Act
        Document document = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(new ParseSettings(), parser);
        instance.initialiseParse(input, baseUri, parser);

        // Assert
    }

}