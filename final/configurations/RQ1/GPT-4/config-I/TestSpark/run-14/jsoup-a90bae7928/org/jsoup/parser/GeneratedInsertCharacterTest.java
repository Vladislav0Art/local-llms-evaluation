package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        Token.Character character = new Token.Character();
        character.data("test");
        character.cdata(false);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(character);
        assertEquals(1, builder.doc.childNodes().size());
    }

}