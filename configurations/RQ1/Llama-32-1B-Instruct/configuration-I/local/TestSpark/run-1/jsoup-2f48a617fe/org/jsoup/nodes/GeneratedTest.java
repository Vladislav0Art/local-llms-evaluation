package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void should_create_comment() {
        // Arrange
        String data = "Hello, World!";
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = Parser.htmlParser().settings(parseSettings).parseInput(data, baseUri());

        // Act
        Document document = parser.parse();

        // Assert
        assertEquals("#comment", getnodeName());
    }

    @Test
    public void should_get_comment_data() {
        // Arrange
        String data = "Hello, World!";
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = Parser.htmlParser().settings(parseSettings).parseInput(data, baseUri());

        // Act
        Document document = parser.parse();

        // Assert
        assertEquals(data, getData());
    }

    @Test
    public void should_set_comment_data() {
        // Arrange
        String data = "Hello, World!";
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = Parser.htmlParser().settings(parseSettings).parseInput(data, baseUri());

        // Act
        Document document = parser.parse();

        // Assert
        assertEquals(data, getData());
    }

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

    @Test
    public void should_not_cascade_xml_declaration_comment() {
        // Arrange
        String data = "<p>Hello, World!</p>";
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = Parser.htmlParser().settings(parseSettings).parseInput(data, baseUri());

        // Act
        Document document = parser.parse();

        // Assert
        assertNull(asXmlDeclaration());
    }

    @Test
    public void should_cannot_cascade_comment_after_xml_declaration_comment() {
        // Arrange
        String data = "<p>Hello, World!</p>";
        ParseSettings parseSettings = new ParseSettings();
        Parser parser = Parser.htmlParser().settings(parseSettings).parseInput(data, baseUri());

        // Act
        Document document = parser.parse();

        // Assert
        assertNull(asXmlDeclaration());
    }

}