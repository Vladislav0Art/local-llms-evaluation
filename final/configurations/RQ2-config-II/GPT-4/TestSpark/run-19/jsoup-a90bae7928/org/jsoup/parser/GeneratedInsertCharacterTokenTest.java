package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedInsertCharacterTokenTest {

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.data("data");
        builder.insert(character);
        Node last = builder.stack.last().childNode(0);
        assertTrue(last instanceof TextNode);
        assertEquals("data", ((TextNode) last).getWholeText());
    }

}