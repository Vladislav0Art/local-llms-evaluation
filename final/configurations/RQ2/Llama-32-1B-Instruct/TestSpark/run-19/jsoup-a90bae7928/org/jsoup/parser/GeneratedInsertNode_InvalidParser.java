package org.jsoup.parser;

public class GeneratedInsertNode_InvalidParser {

    @Test
    public void insertNode_InvalidParser() {
        // Arrange
        String input = "<root><child/></root>";
        String baseUri = "http://example.com";
        Parser parser = new DefaultParser();

        // Act
        Document document = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(new ParseSettings(), parser);
        instance.insertNode("element", input);

        // Assert
    }

}