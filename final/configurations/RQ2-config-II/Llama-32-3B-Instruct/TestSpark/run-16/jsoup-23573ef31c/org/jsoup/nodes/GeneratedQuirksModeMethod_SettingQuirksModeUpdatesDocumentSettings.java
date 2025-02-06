package org.jsoup.nodes;

public class GeneratedQuirksModeMethod_SettingQuirksModeUpdatesDocumentSettings {

    @Test
    public void quirksModeMethod_SettingQuirksModeUpdatesDocumentSettings() {
        QuirksMode mode = QuirksMode.CONSTANT;
        Document doc = Document.createShell("");
        Document result = doc.quirksMode(mode);
        assertNotNull(result);
        assertEquals(mode, result.quirksMode());
    }

}