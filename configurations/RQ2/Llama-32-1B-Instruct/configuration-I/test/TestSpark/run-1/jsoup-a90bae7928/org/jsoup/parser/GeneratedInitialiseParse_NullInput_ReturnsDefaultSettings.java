package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedInitialiseParse_NullInput_ReturnsDefaultSettings {

    @Test
    public void initialiseParse_NullInput_ReturnsDefaultSettings() {
        // Arrange
        String baseUri = "https://example.com";
        Parser parser = Mockito.mock(Parser.class);

        // Act
        Document document = XmlTreeBuilder.defaultSettings().initialiseParse(null, baseUri, parser);

        // Assert
        Mockito.verify(defaultSettings).initialiseParse(baseUri, baseUri);
    }

}