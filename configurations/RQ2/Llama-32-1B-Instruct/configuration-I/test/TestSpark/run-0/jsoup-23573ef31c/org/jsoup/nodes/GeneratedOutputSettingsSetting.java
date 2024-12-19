package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedOutputSettingsSetting {

    @Test
    public void outputSettingsSetting() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        OutputSettings outputSettings = document.outputSettings(null).outputSettings();

        // Assert
        assertNotNull(outputSettings);
    }

}