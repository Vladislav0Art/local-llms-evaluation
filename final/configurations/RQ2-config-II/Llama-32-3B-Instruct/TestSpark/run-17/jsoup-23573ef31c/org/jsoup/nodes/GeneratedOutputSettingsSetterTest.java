package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedOutputSettingsSetterTest {

    @Test
    public void outputSettingsSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        OutputSettings outputSettings = new OutputSettings();
        Document result = document.outputSettings(outputSettings);

        // Assert
        assertNotNull(result);
    }

}