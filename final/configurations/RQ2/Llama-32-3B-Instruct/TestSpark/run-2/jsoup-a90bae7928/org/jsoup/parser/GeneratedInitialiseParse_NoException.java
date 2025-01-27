package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedInitialiseParse_NoException {

    @Test
    public void initialiseParse_NoException() {
        // Arrange
        Reader reader = new StringReader("");
        Parser parser = mock(Parser.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        // Act
        void exception = null;
        xmlTreeBuilder.initialiseParse(reader, "", parser);

        // Assert
        verify(parser).initialiseParse(null, null, null);
    }

}