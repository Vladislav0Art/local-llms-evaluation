package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTrackNewlines {

    @Test
    public void testTrackNewlines() {
        CharacterReader characterReader = new CharacterReader("test");
        characterReader.trackNewlines(true);
        assertTrue(characterReader.isTrackNewlines());
    }

}