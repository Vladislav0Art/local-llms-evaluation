package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestProcessToken {

    @Test
    public void testProcessToken() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token(Token.StartTag.start(), "hello", null, false);
        builder.process(token);
        Mockito.verify(builder).process(Mockito.any());
    }

}