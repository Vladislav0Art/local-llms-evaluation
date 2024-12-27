package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestTransitionOk {

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
    public void testTransitionOk() {
        // Arrange
        Mockito.when(builder.framesetOk(true)).thenReturn(true);

        // Act
        boolean result = builder.framesetOk();

        // Assert
        assertTrue(result);
    }

}