package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestTransition {

    private HtmlTreeBuilder builder;
    private Parser parser;
    private Reader reader;

    @Before
    public void setup() {
        reader = Mockito.mock(Reader.class);
        parser = Mockito.mock(Parser.class);
        builder = new HtmlTreeBuilder();
    }

    @Test
    public void testTransition() {
        // Arrange
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);

        // Act
        builder.transition(state);

        // Assert
        Mockito.verify(state).transition();
    }

}