package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParserSettings;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTest {

    private HtmlTreeBuilder htmlTreeBuilder;

    @Before
    public void setUp() {
        htmlTreeBuilder = new HtmlTreeBuilder();
    }

    @Test
    public void defaultSettingsReturnsDefaultParseSettings() {
        // Arrange
        ParserSettings settings = Mockito.mock(ParserSettings.class);

        // Act
        htmlTreeBuilder.defaultSettings();

        // Assert
        Mockito.verify(settings).setAllowTags(null);
        Mockito.verify(settings).setAllowEntities(null);
        Mockito.verify(settings).setAllowComments(null);
    }

    @Test
    public void newInstanceReturnsNewInstance() {
        HtmlTreeBuilder instance = htmlTreeBuilder.newInstance();
        assertNotNull(instance);
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

    @Test
    public void parseFragmentFindsElementInDocument() {
        // Arrange
        Document document = new Document();
        String inputFragment = "<html><body>Hello World!</body></html>";
        Element element = Mockito.mock(Element.class);

        // Act
        List<Node> result = htmlTreeBuilder.parseFragment(inputFragment, null, "", null);
        assertTrue(result.contains(element));
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

    @Test
    public void transitionSetsState() {
        // Arrange
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);

        // Act
        htmlTreeBuilder.transition(state);
        Mockito.verify(state).updateState();
    }

}