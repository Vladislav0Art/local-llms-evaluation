package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedInitialiseParse_ReturnsDefaultSettings {

    @Test
    public void initialiseParse_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "https://example.com";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse(baseUri, baseUri);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

}