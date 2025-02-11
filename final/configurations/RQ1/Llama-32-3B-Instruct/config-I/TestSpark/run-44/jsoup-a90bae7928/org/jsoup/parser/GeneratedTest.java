package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void initialiseParse_ValidReader_ReturnsCorrectDocument() {
        String input = "<xml><root>test</root></xml>";
        Reader reader = new StringReader(input);
        Document expectedDoc = Document.parse(reader, "http://example.com", null).getDocument();
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        Document actualDoc = builder.initialiseParse(reader, "http://example.com", new Parser(builder)).getDocument();

        assertEquals(expectedDoc, actualDoc);
    }

    @Test
    public void initialiseParse_InvalidReader_ThrowsException() {
        Reader reader = null;
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        try {
            builder.initialiseParse(reader, "http://example.com", new Parser(builder));
            fail("Expected exception not thrown");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void parse_ValidString_ReturnsCorrectDocument() {
        String input = "<xml><root>test</root></xml>";
        Document expectedDoc = Document.parse(input, "http://example.com", new Parser(XmlTreeBuilder.class)).getDocument();
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        Document actualDoc = builder.parse(new StringReader(input), "http://example.com").getDocument();

        assertEquals(expectedDoc, actualDoc);
    }

    @Test
    public void parse_InvalidString_ReturnsCorrectDocument() {
        String input = "";
        Document expectedDoc = null;
        XmlTreeBuilder builder = Mockito.mock(XmlTreeBuilder.class);
        when(builder.defaultSettings()).thenReturn(ParseSettings.preserveCase);

        Document actualDoc = builder.parse(input, "http://example.com").getDocument();

        assertEquals(expectedDoc, actualDoc);
    }

    @Test
    public void newInstance_ReturnsCorrectXmlTreeBuilder() {
        XmlTreeBuilder expectedBuilder = new XmlTreeBuilder();
        XmlTreeBuilder actualBuilder = new XmlTreeBuilder();

        assertEquals(expectedBuilder, actualBuilder.newInstance());
    }

    @Test
    public void process_ValidToken_ReturnsTrue() {
        Token token = Mockito.mock(Token.class);
        when(token.type).thenReturn(Token.StartTag);

        boolean result = XmlTreeBuilder.class.getMethod("process", Token.class).invoke(null, token);

        assertTrue(result);
    }

}