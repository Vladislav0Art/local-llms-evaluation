package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTokenTest {

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("a");
        parser.insert(characterToken);
    }

}