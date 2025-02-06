package org.jsoup.nodes;

public class GeneratedOutputSettingsMethod_SettingOutputSettingsUpdatesDocumentSettings {

    @Test
    public void outputSettingsMethod_SettingOutputSettingsUpdatesDocumentSettings() {
        OutputSettings settings = new OutputSettings();
        Document doc = Document.createShell("");
        Document result = doc.outputSettings(settings);
        assertNotNull(result);
        assertEquals(settings, result.outputSettings());
    }

}