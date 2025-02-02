package org.jsoup.nodes;

public class GeneratedTestDocument {

    @Test
    public void testDocument() {
        //Arrange
        Connection connection = new Connection();
        Parser parser = new Parser();
        OutputSettings outputSettings = new OutputSettings();

        //Act
        Document document = new Document(connection, parser, outputSettings);

        //Assert
        assertNotNull(document);
        assertEquals(parser, document.parser());
    }

}