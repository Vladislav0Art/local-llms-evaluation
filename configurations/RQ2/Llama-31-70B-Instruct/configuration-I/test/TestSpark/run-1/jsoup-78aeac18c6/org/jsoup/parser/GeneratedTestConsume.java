package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConsume {

    @Test
    public void testConsume() {
        CharacterReader characterReader = new CharacterReader("test");
        assertEquals('t', characterReader.consume());
    }

}