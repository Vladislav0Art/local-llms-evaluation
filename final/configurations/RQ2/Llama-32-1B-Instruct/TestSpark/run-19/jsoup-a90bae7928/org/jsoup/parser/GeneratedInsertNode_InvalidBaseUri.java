package org.jsoup.parser;

public class GeneratedInsertNode_InvalidBaseUri {

    @Test
    public void insertNode_InvalidBaseUri() {
        // Arrange
        String input = "<root><child/></root>";
        String baseUri = "invalid";
        Parser parser = new DefaultParser();

        // Act
        Document document = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(new ParseSettings(), parser);
        try {
            instance.insertNode(input, "element");
            fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        }

        // Assert
    }

}