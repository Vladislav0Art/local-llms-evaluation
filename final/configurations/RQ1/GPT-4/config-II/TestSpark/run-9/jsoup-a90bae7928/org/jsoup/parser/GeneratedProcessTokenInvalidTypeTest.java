package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessTokenInvalidTypeTest {

    @Test
    public void processTokenInvalidTypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.Character();
        token.type = Token.TokenType.EOF;
        xmlTreeBuilder.process(token);
    }

}