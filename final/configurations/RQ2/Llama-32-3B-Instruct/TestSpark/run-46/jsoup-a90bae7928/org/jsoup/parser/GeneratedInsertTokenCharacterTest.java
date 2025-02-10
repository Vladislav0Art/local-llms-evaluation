package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.util.List;

public class GeneratedInsertTokenCharacterTest {

    @Test
    public void insertTokenCharacterTest() {
        Token token = new Token(new Character('a'));
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(token);
        assertEquals(1, builder.getInsertedTokens().size());
    }

}