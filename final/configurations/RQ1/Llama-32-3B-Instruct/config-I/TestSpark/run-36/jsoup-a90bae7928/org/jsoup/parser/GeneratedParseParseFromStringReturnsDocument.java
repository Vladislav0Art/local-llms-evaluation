package org.jsoup.parser;

public class GeneratedParseParseFromStringReturnsDocument {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void parseParseFromStringReturnsDocument() throws Exception {
        // Arrange
        final String input = "<root></root>";
        final String baseUri = "http://example.com";

        // Act
        Document doc = xmlTreeBuilder.parse(input, baseUri);

        // Assert
        Assert.assertNotNull(doc);
    }

}