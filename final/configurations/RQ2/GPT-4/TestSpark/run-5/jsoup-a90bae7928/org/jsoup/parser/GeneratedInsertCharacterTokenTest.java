package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTokenTest {

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("test");
        builder.insert(characterToken);
        List<Node> childNodes = builder.getStack();
        assertEquals(childNodes.get(0).childNode(0).nodeName(), "#text");
        assertEquals(((TextNode) childNodes.get(0).childNode(0)).text(), "test");
    }

}