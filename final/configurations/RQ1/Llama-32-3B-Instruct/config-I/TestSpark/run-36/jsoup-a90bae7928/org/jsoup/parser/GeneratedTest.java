package org.jsoup.parser;

public class GeneratedTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void defaultSettingsReturnsPreserveCase() {
        Assert.assertEquals(ParseSettings.preserveCase, xmlTreeBuilder.defaultSettings());
    }

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

    @Test
    public void newInstanceReturnsNewInstance() {
        Assert.assertNotSame(xmlTreeBuilder, new XmlTreeBuilder());
    }

}