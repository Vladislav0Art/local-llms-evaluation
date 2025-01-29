package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertNodeToken {

    @Test
    public void testInsertNodeToken() {
        Token token = new Token(Token.Type Comment, "comment", null, null, null, null);
        Mockito.when(token.getTokenizer()).thenReturn(Mockito.mock(Readable.class));
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(null, null, Mockito.mock(Readable.class));
        xmlTreeBuilder.insert(token);
    }

}