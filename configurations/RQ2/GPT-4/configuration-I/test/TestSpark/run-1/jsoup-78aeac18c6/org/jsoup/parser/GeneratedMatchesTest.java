package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedMatchesTest {

    @Test
    public void matchesTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertTrue(characterReader.matches('t'));
    }

}