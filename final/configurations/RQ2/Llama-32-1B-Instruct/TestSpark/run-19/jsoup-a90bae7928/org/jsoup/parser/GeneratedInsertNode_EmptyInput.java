package org.jsoup.parser;

public class GeneratedInsertNode_EmptyInput {

    @Test
    public void insertNode_EmptyInput() {
        // Arrange
        String baseUri = "http://example.com";
        Parser parser = new DefaultParser();

        // Act
        Document document = new Document();
        XmlTreeBuilder instance = new XmlTreeBuilder(new ParseSettings(), parser);
        try {
            instance.insertNode(input, null);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        }

        // Assert
    }

}