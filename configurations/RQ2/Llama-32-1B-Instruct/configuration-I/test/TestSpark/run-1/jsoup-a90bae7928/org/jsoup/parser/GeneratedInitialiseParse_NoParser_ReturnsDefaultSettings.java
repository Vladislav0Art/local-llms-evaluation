package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedInitialiseParse_NoParser_ReturnsDefaultSettings {

    @Test
    public void initialiseParse_NoParser_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "https://example.com";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse("", baseUri, null);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

}