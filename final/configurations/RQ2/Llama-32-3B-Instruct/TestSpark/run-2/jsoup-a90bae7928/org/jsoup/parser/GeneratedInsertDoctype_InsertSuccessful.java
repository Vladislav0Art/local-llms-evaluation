package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedInsertDoctype_InsertSuccessful {

    @Test
    public void insertDoctype_InsertSuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.insert(token)).thenReturn(new Element());

        // Act
        Element result = new XmlTreeBuilder().insert(token);

        // Assert
        verify(parser).insert(token);
    }

}