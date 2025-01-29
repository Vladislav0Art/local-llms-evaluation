package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestPopStackToCloseCharacter {

    @Test
    public void testPopStackToCloseCharacter() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token(Token.Character.character(), null, null, true);
        builder.popStackToClose(token);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

}