package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;

public class GeneratedInsertElement_GivenCharacter_WhenCalled {

    @Test
    public void insertElement_GivenCharacter_WhenCalled() {
        // given
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character characterToken = Token.Character.ROOT;

        // when
        builder.insert(characterToken);

        // then
        assertTrue(builder.process(characterToken) == true);
    }

}