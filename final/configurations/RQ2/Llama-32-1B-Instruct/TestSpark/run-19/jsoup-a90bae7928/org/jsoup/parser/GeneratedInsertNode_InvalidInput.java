package org.jsoup.parser;

public class GeneratedInsertNode_InvalidInput {

    @Test
    public void insertNode_InvalidInput() {
        // Arrange
        String baseUri = "http://example.com";
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