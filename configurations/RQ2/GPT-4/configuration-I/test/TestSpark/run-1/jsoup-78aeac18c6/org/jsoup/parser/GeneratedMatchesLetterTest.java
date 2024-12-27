package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedMatchesLetterTest {

    @Test
    public void matchesLetterTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertTrue(characterReader.matchesLetter());
    }

}