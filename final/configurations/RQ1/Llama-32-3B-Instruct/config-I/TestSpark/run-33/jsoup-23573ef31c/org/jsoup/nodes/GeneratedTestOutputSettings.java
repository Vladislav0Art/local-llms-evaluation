package org.jsoup.nodes;

public class GeneratedTestOutputSettings {

    @Test
    public void testOutputSettings() {
        //Arrange
        Connection connection = new Connection();
        Parser parser = new Parser();
        OutputSettings outputSettings = new OutputSettings();

        //Act
        Document document = new Document(connection, parser, outputSettings);

        //Assert
        assertNotNull(outputSettings);
        assertSame(outputSettings, document.outputSettings());
    }
}

}