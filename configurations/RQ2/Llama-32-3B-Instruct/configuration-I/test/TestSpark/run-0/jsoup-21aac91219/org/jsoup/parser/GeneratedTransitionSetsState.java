package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParserSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTransitionSetsState {

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void transitionSetsState() {
        // Arrange
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);

        // Act
        htmlTreeBuilder.transition(state);
        Mockito.verify(state).updateState();
    }

}