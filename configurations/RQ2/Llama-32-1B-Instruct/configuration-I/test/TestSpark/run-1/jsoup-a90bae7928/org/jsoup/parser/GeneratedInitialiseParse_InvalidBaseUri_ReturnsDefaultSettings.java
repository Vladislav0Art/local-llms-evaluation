package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedInitialiseParse_InvalidBaseUri_ReturnsDefaultSettings {

    @Test
    public void initialiseParse_InvalidBaseUri_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "invalid uri";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse("", baseUri, parser);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

}