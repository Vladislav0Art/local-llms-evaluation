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
public class GeneratedTestInitialiseParse {

    @Mock
    private Tokeniser tokeniser;

    @Test
    public void testInitialiseParse() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        when(tokeniser.read()).thenReturn(Token.EOF);
        xmlTreeBuilder.initialiseParse(tokeniser, "baseUri", null);
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

}