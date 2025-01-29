package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertNodeCharacterToken {

    @Test
    public void testInsertNodeCharacterToken() {
        Token token = new Token(Token.Type Character, "char", null, null, null, null);
        Mockito.when(token.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.insert(token);
    }

}