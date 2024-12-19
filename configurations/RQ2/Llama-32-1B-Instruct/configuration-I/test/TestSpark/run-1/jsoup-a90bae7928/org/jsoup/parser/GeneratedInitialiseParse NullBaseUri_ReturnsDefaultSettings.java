package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedInitialiseParse NullBaseUri_ReturnsDefaultSettings {

    @Test
    public void initialiseParse

    NullBaseUri_ReturnsDefaultSettings() {
        // Arrange
        String input = "https://example.com";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse(input, null, parser);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(input, input);
    }

}