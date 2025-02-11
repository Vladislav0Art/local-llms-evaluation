package org.jsoup.parser;

public class GeneratedParseParseFromReaderReturnsDocument {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void parseParseFromReaderReturnsDocument() throws Exception {
        // Arrange
        final Reader input = new StringReader("<root></root>");
        final String baseUri = "http://example.com";

        // Act
        Document doc = xmlTreeBuilder.parse(input, baseUri);

        // Assert
        Assert.assertNotNull(doc);
    }

}