package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertCharacter {

    @Test
    public void testInsertCharacter() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token(Token.Character.character(), null, null, true);
        builder.insert(token);
        Mockito.verify(builder).insertToken(Mockito.any());
    }

}