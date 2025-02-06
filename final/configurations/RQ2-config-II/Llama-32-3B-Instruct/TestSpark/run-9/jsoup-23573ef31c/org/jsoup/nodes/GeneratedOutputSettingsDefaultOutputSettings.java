package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOutputSettingsDefaultOutputSettings {

    @Test
    public void outputSettingsDefaultOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("");
        assert document.outputSettings(outputSettings) == document;
    }

}