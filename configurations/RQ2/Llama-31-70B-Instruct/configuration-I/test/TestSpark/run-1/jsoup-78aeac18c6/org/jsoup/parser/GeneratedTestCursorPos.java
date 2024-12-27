package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCursorPos {

    @Test
    public void testCursorPos() {
        CharacterReader characterReader = new CharacterReader("test");
        assertEquals("1:1", characterReader.cursorPos());
    }

}