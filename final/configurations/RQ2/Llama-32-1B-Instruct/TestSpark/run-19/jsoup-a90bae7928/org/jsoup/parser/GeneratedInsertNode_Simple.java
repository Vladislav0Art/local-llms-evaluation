package org.jsoup.parser;

public class GeneratedInsertNode_Simple {

    @Test
    public void insertNode_Simple() {
        // Arrange
        String input = "<root><child/></root>";
        String baseUri = "http://example.com";
        Parser parser = new DefaultParser();

        // Act
        Document document = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(new ParseSettings(), parser);
        instance.insertNode("element");

        // Assert
    }

}