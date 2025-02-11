package org.jsoup.parser;

public class GeneratedInitialiseParseInitializesStackWithDocument {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void initialiseParseInitializesStackWithDocument() throws Exception {
        // Arrange
        final Reader input = new StringReader("<root></root>");
        final String baseUri = "http://example.com";

        // Act
        xmlTreeBuilder.initialiseParse(input, baseUri, null);

        // Assert
        Assert.assertTrue(xmlTreeBuilder.stack.size() == 1);
    }

}