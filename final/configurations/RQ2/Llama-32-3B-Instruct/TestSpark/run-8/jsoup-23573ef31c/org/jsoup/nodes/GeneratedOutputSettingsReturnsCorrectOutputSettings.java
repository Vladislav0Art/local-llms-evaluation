package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOutputSettingsReturnsCorrectOutputSettings {

    @Test
    public void outputSettingsReturnsCorrectOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("http://example.com");
        Document result = document.outputSettings(outputSettings);
        assertNotNull(result);
        assertEquals(outputSettings, result.outputSettings());
    }

}