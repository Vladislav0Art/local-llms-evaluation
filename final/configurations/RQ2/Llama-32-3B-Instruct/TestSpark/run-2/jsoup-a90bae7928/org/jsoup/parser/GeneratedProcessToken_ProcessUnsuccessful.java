package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedProcessToken_ProcessUnsuccessful {

    @Test
    public void processToken_ProcessUnsuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.process(token)).thenReturn(false);

        // Act

        // Assert
    }

}