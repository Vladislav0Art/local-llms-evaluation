package org.jsoup.nodes;

public class GeneratedTestDocument {

    @Test
    public void testDocument() {
        // Arrange
        Parser parser = new Parser();
        Connection connection = new Connection();

        // Act
        Document document = new Document().parser(parser).connection(connection);

        // Assert
        assertNotNull(document);
    }
}

}