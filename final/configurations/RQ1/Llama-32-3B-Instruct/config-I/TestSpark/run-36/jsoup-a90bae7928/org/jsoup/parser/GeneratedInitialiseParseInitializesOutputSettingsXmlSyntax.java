package org.jsoup.parser;

public class GeneratedInitialiseParseInitializesOutputSettingsXmlSyntax {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void initialiseParseInitializesOutputSettingsXmlSyntax() throws Exception {
        // Arrange
        final Reader input = new StringReader("<root></root>");
        final String baseUri = "http://example.com";

        // Act
        xmlTreeBuilder.initialiseParse(input, baseUri, null);

        // Assert
        Assert.assertEquals(OutputSettings.Syntax.xml, xmlTreeBuilder.doc.outputSettings().syntax());
    }

}