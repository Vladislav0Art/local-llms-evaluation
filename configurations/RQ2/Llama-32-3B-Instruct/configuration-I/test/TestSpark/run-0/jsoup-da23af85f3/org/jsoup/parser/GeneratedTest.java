package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Test
    public void defaultSettings() {
        Function<HtmlTreeBuilder, ParseSettings> defaultSettingsFunction = HtmlTreeBuilder::defaultSettings;
        assertEquals(parseSettings, defaultSettingsFunction.apply(new HtmlTreeBuilder()));
    }

    @Test
    public void newInstance() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        HtmlTreeBuilder newInstance = htmlTreeBuilder.newInstance();
        assertNotNull(newInstance);
    }

    @Test
    public void initialiseParse() {
        Function<HtmlTreeBuilder, void> initialiseParseFunction = HtmlTreeBuilder::initialiseParse;
        initialiseParseFunction.apply(new HtmlTreeBuilder());
    }

    @Test
    public void parseFragment() {
        List<Node> expectedNodes = new ArrayList<>();
        // Arrange
        when(parser.parse(any(String.class))).thenReturn(expectedNodes);
        String inputFragment = "fragment";
        Element context = Mockito.mock(Element.class);
        String baseUri = "uri";
        Parser parserInstance = Mockito.mock(Parser.class);

        // Act
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        List<Node> result = htmlTreeBuilder.parseFragment(inputFragment, context, baseUri, parserInstance);

        // Assert
        assertEquals(expectedNodes, result);
    }

    @Test
    public void process() {
        boolean expectedValue = true;
        Token token = Mockito.mock(Token.class);
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);

        when(token.getType()).thenReturn(0);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        boolean result = htmlTreeBuilder.process(token, state);
        assertEquals(expectedValue, result);
    }

    @Test
    public void processToken() {
        boolean expectedValue = false;
        Token token = Mockito.mock(Token.class);
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);

        when(token.getType()).thenReturn(0);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        boolean result = htmlTreeBuilder.process(token, state);
        assertEquals(expectedValue, result);
    }

    @Test
    public void transition() {
        HtmlTreeBuilderState expectedState = Mockito.mock(HtmlTreeBuilderState.class);
        when(state()).thenReturn(expectedState);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        HtmlTreeBuilderState result = htmlTreeBuilder.transition(Mockito.anyObject());
        assertEquals(expectedState, result);
    }

    @Test
    public void state() {
        HtmlTreeBuilderState expectedState = Mockito.mock(HtmlTreeBuilderState.class);
        when(state()).thenReturn(expectedState);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        HtmlTreeBuilderState result = htmlTreeBuilder.state();
        assertEquals(expectedState, result);
    }

    @Test
    public void markInsertionMode() {
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);
        when(state.isInsertionMode()).thenReturn(false);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        boolean result = htmlTreeBuilder.markInsertionMode(state);
        assertTrue(result);
    }

    @Test
    public void isContentForTagData() {
        boolean expectedValue = true;
        String normalName = "normal";
        when(isContentForTagData(normalName)).thenReturn(expectedValue);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        boolean result = htmlTreeBuilder.isContentForTagData(normalName);
        assertEquals(expectedValue, result);
    }

    @Test
    public void toString() {
        String expectedString = "toString";
        when(parser.toString()).thenReturn(expectedString);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        String result = htmlTreeBuilder.toString();
        assertEquals(expectedString, result);
    }

}