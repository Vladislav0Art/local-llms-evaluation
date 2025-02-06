package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedOutputSettings_OutputSettingsUpdatedCorrectly {

    @Test
    public void outputSettings_OutputSettingsUpdatedCorrectly() {
        // Given
        OutputSettings outputSettings = new OutputSettings();

        // When
        Document document = new Document("https://www.example.com");
        document.outputSettings(outputSettings);

        // Then
        assertEquals(outputSettings, document.outputSettings());
    }

}