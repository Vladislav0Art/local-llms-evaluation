package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedProcess_ValidToken_ReturnsTrue {

    @Test
    public void process_ValidToken_ReturnsTrue() {
        Token token = Mockito.mock(Token.class);
        when(token.type).thenReturn(Token.StartTag);

        boolean result = XmlTreeBuilder.class.getMethod("process", Token.class).invoke(null, token);

        assertTrue(result);
    }

}