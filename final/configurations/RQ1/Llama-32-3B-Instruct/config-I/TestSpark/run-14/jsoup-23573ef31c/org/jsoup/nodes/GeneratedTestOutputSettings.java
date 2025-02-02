package org.jsoup.nodes;

public class GeneratedTestOutputSettings {

    @Test
    public void testOutputSettings() {
        // Given
        OutputSettings outputSettings = new OutputSettings();

        // When
        Document document = new Document("<html><body>Hello World!</body></html>", outputSettings);

        // Then
        Assert.assertNotNull(document.outputSettings());
        Assert.assertEquals(true, document.outputSettings().prettyPrint());
    }

}