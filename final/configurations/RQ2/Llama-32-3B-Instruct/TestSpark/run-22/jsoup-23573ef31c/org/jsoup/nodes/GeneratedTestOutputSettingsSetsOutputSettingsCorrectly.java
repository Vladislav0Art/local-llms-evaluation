package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedTestOutputSettingsSetsOutputSettingsCorrectly {

    @Test
    public void testOutputSettingsSetsOutputSettingsCorrectly() {
        OutputSettings originalSettings = new OutputSettings();
        Document document = Document.createShell("https://example.com");
        document.outputSettings(originalSettings);
        assertNotNull(document.outputSettings());
        assertEquals(originalSettings, document.outputSettings());
    }

}