package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestProcessStartTag {

    @Mock
    private Tokeniser tokeniser;

    @Mock
    private Token.StartTag startTag;

    @Mock
    private Token.EndTag endTag;

    @Mock
    private Token.Comment comment;

    @Mock
    private Token.Character character;

    @Mock
    private Token.Doctype doctype;

    @Test
    public void testProcessStartTag() {
        when(tokeniser.read()).thenReturn(Token.TokenType.StartTag);
        when(tokeniser.emit()).thenReturn(startTag);

        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(null, null, null);
        xmlTreeBuilder.tokeniser = tokeniser;

        assertEquals(true, xmlTreeBuilder.process(Token.TokenType.StartTag));
    }

}