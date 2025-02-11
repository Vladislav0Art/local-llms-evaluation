package org.jsoup.parser;

public class GeneratedInitialiseParseInitializesPrettyPrintFalse {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void initialiseParseInitializesPrettyPrintFalse() throws Exception {
        // Arrange
        final Reader input = new StringReader("<root></root>");
        final String baseUri = "http://example.com";

        // Act
        xmlTreeBuilder.initialiseParse(input, baseUri, null);

        // Assert
        Assert.assertFalse(xmlTreeBuilder.doc.outputSettings().prettyPrint());
    }

}