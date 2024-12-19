package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.mockito.Mockito;

public class GeneratedProcess_OnlyToken_ReturnsFalse {

    @Test
    public void process_OnlyToken_ReturnsFalse() {
        // Arrange
        String input = "token";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(defaultSettings);

        // Act
        boolean result = xmlTreeBuilder.process(new Token(input));

        // Assert
        Mockito.verifyNoMoreInteractions(parser, defaultSettings);
    }

}