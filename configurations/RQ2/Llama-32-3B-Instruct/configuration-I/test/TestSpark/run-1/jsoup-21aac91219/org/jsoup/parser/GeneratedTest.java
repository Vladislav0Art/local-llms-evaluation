package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

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
    public void testDefaultSettings() {
        // Arrange
        Mockito.when(builder.defaultSettings()).thenReturn(new ParseSettings());

        // Act
        ParseSettings settings = builder.defaultSettings();

        // Assert
        assert settings != null;
    }

    @Test
    public void testNewInstance() {
        // Act
        HtmlTreeBuilder newInstance = builder.newInstance();

        // Assert
        assertNotNull(newInstance);
    }

    @Test
    public void testInitialiseParse() {
        // Arrange
        Mockito.when(parser.getSettings()).thenReturn(new ParseSettings());

        // Act
        builder.initialiseParse(reader, null, parser);

        // Assert
        Mockito.verify(parser).initialise(reader, new ParseSettings());
    }

    @Test
    public void testParseFragment() {
        // Arrange
        String inputFragment = "fragment";
        Element context = Mockito.mock(Element.class);
        Mockito.when(context.toString()).thenReturn("context");
        Mockito.when(builder.defaultSettings()).thenReturn(new ParseSettings());

        // Act
        List<Node> nodes = builder.parseFragment(inputFragment, context, null, parser);

        // Assert
        assert nodes != null;
    }

    @Test
    public void testProcessToken() {
        // Arrange
        Token token = new Token();
        Mockito.when(token.getType()).thenReturn(Token.Type.startTag);
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);

        // Act
        boolean result = builder.process(token);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testProcessTokenWithState() {
        // Arrange
        Token token = new Token();
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);
        Mockito.when(state.getState()).thenReturn("state");

        // Act
        boolean result = builder.process(token, state);

        // Assert
        assertTrue(result);
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

    @Test
    public void testTransitionOk() {
        // Arrange
        Mockito.when(builder.framesetOk(true)).thenReturn(true);

        // Act
        boolean result = builder.framesetOk();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testGetDocument() {
        // Arrange

        // Act
        Document document = builder.getDocument();

        // Assert
        assertNotNull(document);
    }

    @Test
    public void testGetBaseUri() {
        // Arrange

        // Act
        String baseUri = builder.getBaseUri();

        // Assert
        assertNotNull(baseUri);
    }

    @Test
    public void testMaybeSetBaseUri() {
        // Arrange
        Element base = Mockito.mock(Element.class);

        // Act
        builder.maybeSetBaseUri(base);

        // Assert
        Mockito.verify(base).setBaseUri();
    }

    @Test
    public void testIsFragmentParsing() {
        // Arrange

        // Act
        boolean result = builder.isFragmentParsing();

        // Assert
        assertTrue(result);
    }

}