package org.jsoup.nodes;

public class GeneratedTestDocumentClone {

    @Test
    public void testDocumentClone() {
        // Arrange
        QuirksMode quirksMode = new QuirksMode();
        Parser parser = new Parser();
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document(quirksMode, parser, outputSettings);

        // Act
        Document clone = document.clone(quirksMode, parser, outputSettings);

        // Assert
        assertNotNull(clone);
    }

}