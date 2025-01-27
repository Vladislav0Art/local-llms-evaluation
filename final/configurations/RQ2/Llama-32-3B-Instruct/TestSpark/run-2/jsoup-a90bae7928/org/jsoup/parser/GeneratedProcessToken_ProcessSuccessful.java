package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedProcessToken_ProcessSuccessful {

    @Test
    public void processToken_ProcessSuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.process(token)).thenReturn(true);

        // Act
        boolean result = new XmlTreeBuilder().process(token);

        // Assert
        verify(parser).process(token);
    }

}