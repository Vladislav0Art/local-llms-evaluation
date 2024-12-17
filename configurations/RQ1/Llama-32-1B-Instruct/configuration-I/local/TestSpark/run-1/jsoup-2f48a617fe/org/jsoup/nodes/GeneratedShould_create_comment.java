package org.jsoup.nodes;

public class GeneratedShould_create_comment {

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

}