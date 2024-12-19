package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedProcess_OnlyTokenWithComment_ReturnsTrue {

    @Test
    public void process_OnlyTokenWithComment_ReturnsTrue() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(defaultSettings);

        // Act
        boolean result = xmlTreeBuilder.process(new Token(input, false));

        // Assert
        Mockito.verifyNoMoreInteractions(parser, defaultSettings);
    }

}