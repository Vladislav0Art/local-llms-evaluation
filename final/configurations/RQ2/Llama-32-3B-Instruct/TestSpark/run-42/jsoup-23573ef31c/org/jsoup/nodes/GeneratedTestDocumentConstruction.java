package org.jsoup.nodes;

public class GeneratedTestDocumentConstruction {

    @Test
    public void testDocumentConstruction() {
        // Arrange
        QuirksMode quirksMode = new QuirksMode();
        Parser parser = new Parser();
        OutputSettings outputSettings = new OutputSettings();

        // Act
        Document document = new Document(quirksMode, parser, outputSettings);

        // Assert
        assertNotNull(document);
    }

}