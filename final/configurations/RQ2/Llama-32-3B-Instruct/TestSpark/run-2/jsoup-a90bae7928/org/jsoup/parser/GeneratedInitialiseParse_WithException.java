package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedInitialiseParse_WithException {

    @Test
    public void initialiseParse_WithException() {
        // Arrange
        Reader reader = new StringReader("");
        Parser parser = mock(Parser.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        when(parser.initialiseParse(any(), anyString(), any())).thenThrow(Exception.class);

        // Act
        xmlTreeBuilder.initialiseParse(reader, "", parser);
    }

}