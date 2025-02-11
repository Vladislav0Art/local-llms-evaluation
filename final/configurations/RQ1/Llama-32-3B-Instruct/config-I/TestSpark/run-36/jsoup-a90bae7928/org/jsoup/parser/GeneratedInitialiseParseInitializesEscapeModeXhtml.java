package org.jsoup.parser;

public class GeneratedInitialiseParseInitializesEscapeModeXhtml {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void initialiseParseInitializesEscapeModeXhtml() throws Exception {
        // Arrange
        final Reader input = new StringReader("<root></root>");
        final String baseUri = "http://example.com";

        // Act
        xmlTreeBuilder.initialiseParse(input, baseUri, null);

        // Assert
        Assert.assertEquals(Entities.EscapeMode.xhtml, xmlTreeBuilder.doc.outputSettings().escapeMode());
    }

}