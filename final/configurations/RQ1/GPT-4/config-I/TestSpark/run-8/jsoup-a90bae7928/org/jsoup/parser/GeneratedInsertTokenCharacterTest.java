package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertTokenCharacterTest {

    @Test
    public void InsertTokenCharacterTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Character character = new Character("testData", false);
        testObject.insert(new Token(character));
        assertEquals("testData", ((TextNode) testObject.getCurrentElement().childNode(0)).getWholeText());
    }

}