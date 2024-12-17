package org.jsoup.nodes;

public class GeneratedShould_not_create_xml_declaration_comment {

    @Test
    public void should_not_create_xml_declaration_comment() {
        // Arrange
        String data = "Hello, World!";
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = Parser.htmlParser().settings(parseSettings).parseInput(data, baseUri());

        // Act
        Document document = parser.parse();

        // Assert
        assertNull(asXmlDeclaration());
    }

}