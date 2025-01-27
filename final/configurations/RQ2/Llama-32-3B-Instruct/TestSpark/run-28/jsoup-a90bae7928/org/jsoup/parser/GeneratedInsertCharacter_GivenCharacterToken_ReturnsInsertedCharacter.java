package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedInsertCharacter_GivenCharacterToken_ReturnsInsertedCharacter {

    @Test
    public void insertCharacter_GivenCharacterToken_ReturnsInsertedCharacter() {
        Token.Character token = new Token.Character('c');
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        char insertedCharacter = treeBuilder.insert(token);
        assertNotNull(insertedCharacter);
        assertEquals('c', insertedCharacter);
    }

}