package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestColumnNumber {

    @Test
    public void testColumnNumber() {
        CharacterReader characterReader = new CharacterReader("test");
        assertEquals(1, characterReader.columnNumber());
    }

}