package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCharacterTokenTest {

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.setData("This is a character data");
        xmlTreeBuilder.insert(characterToken);
    }

}