package org.jsoup.nodes;

public class GeneratedShould_cascade_comment_to_xml_declaration_comment {

    @Test
    public void should_cascade_comment_to_xml_declaration_comment() {
        // Arrange
        String data = "<p>Hello, World!</p>";
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = Parser.htmlParser().settings(parseSettings).parseInput(data, baseUri());

        // Act
        Document document = parser.parse();

        // Assert
        assertNotNull(asXmlDeclaration());
    }

}