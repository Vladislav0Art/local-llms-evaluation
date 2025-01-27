package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Token;
import org.jsoup.nodes.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedTest {

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

    @Test
    public void initialiseParse_WithException() {
        // Arrange
        Reader reader = new StringReader("");
        Parser parser = mock(Parser.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        when(parser.initialiseParse(any(), anyString(), any())).thenThrow(Exception.class);

        // Act
        xmlTreeBuilder.initialiseParse(reader, "", parser);
    }

    @Test
    public void parseReader_ParseSuccessful() {
        // Arrange
        Parser parser = mock(Parser.class);
        when(parser.parse(anyString())).thenReturn(new Document());

        // Act
        Document result = new XmlTreeBuilder().parse(reader, baseUri);

        // Assert
        verify(parser).parse(eq("<root><child></child></root>"));
    }

    @Test
    public void parseReader_ParseUnsuccessful() {
        // Arrange
        Parser parser = mock(Parser.class);
        when(parser.parse(anyString())).thenReturn(new Document());

        // Act

        // Assert
    }

    @Test
    public void parseString_ParseSuccessful() {
        // Arrange
        Parser parser = mock(Parser.class);
        when(parser.parse(anyString())).thenReturn(new Document());

        // Act
        Document result = new XmlTreeBuilder().parse(inputFragment, baseUri);

        // Assert
        verify(parser).parse(eq(""));
    }

    @Test
    public void parseString_ParseUnsuccessful() {
        // Arrange
        Parser parser = mock(Parser.class);
        when(parser.parse(anyString())).thenReturn(new Document());

        // Act

        // Assert
    }

    @Test
    public void newInstance_NewInstance() {
        // Act
        XmlTreeBuilder instance = new XmlTreeBuilder();

        // Assert
        assertThat(instance, is(new XmlTreeBuilder()));
    }

    @Test
    public void processToken_ProcessSuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.process(token)).thenReturn(true);

        // Act
        boolean result = new XmlTreeBuilder().process(token);

        // Assert
        verify(parser).process(token);
    }

    @Test
    public void processToken_ProcessUnsuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.process(token)).thenReturn(false);

        // Act

        // Assert
    }

    @Test
    public void insertNode_InsertSuccessful() {
        // Arrange
        Node node = mock(Node.class);
        when(parser.insert(node)).thenReturn(new Element());

        // Act

        // Assert
    }

    @Test
    public void insertStartTag_InsertSuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.startTag(token)).thenReturn(new Element());

        // Act
        Element result = new XmlTreeBuilder().insert(token);

        // Assert
        verify(parser).startTag(token);
    }

    @Test
    public void insertCharacter_InsertSuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.insert(token)).thenReturn(new Element());

        // Act
        Element result = new XmlTreeBuilder().insert(token);

        // Assert
        verify(parser).insert(token);
    }

    @Test
    public void insertDoctype_InsertSuccessful() {
        // Arrange
        Token token = mock(Token.class);
        when(parser.insert(token)).thenReturn(new Element());

        // Act
        Element result = new XmlTreeBuilder().insert(token);

        // Assert
        verify(parser).insert(token);
    }

    @Test
    public void popStackToCloseEndTag_PopSuccessful() {
        // Arrange

        // Act

        // Assert
    }

}