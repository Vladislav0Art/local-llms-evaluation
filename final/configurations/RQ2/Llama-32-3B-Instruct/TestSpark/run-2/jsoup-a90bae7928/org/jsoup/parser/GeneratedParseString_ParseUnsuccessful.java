package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedParseString_ParseUnsuccessful {

    @Test
    public void parseString_ParseUnsuccessful() {
        // Arrange
        Parser parser = mock(Parser.class);
        when(parser.parse(anyString())).thenReturn(new Document());

        // Act

        // Assert
    }

}