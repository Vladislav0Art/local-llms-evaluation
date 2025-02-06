package org.jsoup.nodes;

public class GeneratedOutputSettingsShouldReturnCorrectSettings {

    @Test
    public void outputSettingsShouldReturnCorrectSettings() {
        OutputSettings settings = new OutputSettings();
        Document document = new Document("https://example.com");
        document.outputSettings(settings);
        assertNotNull(settings);
    }

}