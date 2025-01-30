package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedProcessCharacterTest {

    @Test
    public void ProcessCharacterTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Character character = new Character("testData", false);
        Token testToken = new Token(character);
        assertTrue(testObject.process(testToken));
    }

}