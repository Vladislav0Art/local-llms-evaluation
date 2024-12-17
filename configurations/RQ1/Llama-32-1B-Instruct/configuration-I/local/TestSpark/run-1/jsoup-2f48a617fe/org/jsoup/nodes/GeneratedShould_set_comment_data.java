package org.jsoup.nodes;

public class GeneratedShould_set_comment_data {

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

}