package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParserSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedProcessSetsInsertionMode {

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void processSetsInsertionMode() {
        // Arrange
        Token token = new Token();
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);

        // Act
        boolean result = htmlTreeBuilder.process(token, state);
        assertTrue(result);
    }

}