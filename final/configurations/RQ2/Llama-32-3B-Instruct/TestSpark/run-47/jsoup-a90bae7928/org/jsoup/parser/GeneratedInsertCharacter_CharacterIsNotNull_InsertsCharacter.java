package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedInsertCharacter_CharacterIsNotNull_InsertsCharacter {

    @Test
    public void InsertCharacter_CharacterIsNotNull_InsertsCharacter() {
        Character character = 'c';
        new XmlTreeBuilder().insertCharacter(character);
        assertEquals('c', new XmlTreeBuilder().getCharacter());
    }

}