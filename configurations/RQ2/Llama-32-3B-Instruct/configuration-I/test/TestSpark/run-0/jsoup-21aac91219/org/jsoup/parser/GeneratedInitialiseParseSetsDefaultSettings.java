package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParserSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedInitialiseParseSetsDefaultSettings {

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void initialiseParseSetsDefaultSettings() {
        // Arrange
        Parser parser = Mockito.mock(Parser.class);

        // Act
        htmlTreeBuilder.initialiseParse(Mockito.mock(Reader.class), "", parser);

        // Assert
        Mockito.verify(parser).setAllowTags(null);
        Mockito.verify(parser).setAllowEntities(null);
        Mockito.verify(parser).setAllowComments(null);
    }

}