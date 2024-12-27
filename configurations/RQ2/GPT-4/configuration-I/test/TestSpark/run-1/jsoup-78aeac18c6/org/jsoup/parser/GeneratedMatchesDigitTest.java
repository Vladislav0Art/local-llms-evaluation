package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedMatchesDigitTest {

    @Test
    public void matchesDigitTest() {
        CharacterReader characterReader = new CharacterReader("1234");
        Assert.assertTrue(characterReader.matchesDigit());
    }

}