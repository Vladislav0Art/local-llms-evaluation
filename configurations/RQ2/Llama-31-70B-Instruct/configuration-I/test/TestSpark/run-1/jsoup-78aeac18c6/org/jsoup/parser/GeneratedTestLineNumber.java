package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestLineNumber {

    @Test
    public void testLineNumber() {
        CharacterReader characterReader = new CharacterReader("test");
        assertEquals(1, characterReader.lineNumber());
    }

}