package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOutputSettingsOutputSettings_test {

    @Test
    public void outputSettingsOutputSettings_test() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = Document.createShell("http://example.com").outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

}