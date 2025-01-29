package org.jsoup.nodes;

public class GeneratedTestOutputSettingsMethodCall {

    @Test
    public void testOutputSettingsMethodCall() {
        Document document = new Document("https://example.com");
        assertNotNull(document.outputSettings());
        document.outputSettings(new OutputSettings());
    }

}