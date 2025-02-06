package org.jsoup.nodes;

public class GeneratedTestOutputSettingsValidOutputSettings {

    @Test
    public void testOutputSettingsValidOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("");
        document.outputSettings(outputSettings);
        assertNotNull(document.outputSettings());
    }

}