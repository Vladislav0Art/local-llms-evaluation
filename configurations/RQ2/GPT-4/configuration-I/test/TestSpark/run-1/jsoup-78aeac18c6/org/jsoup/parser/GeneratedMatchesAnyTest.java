package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedMatchesAnyTest {

    @Test
    public void matchesAnyTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertTrue(characterReader.matchesAny('a', 'e', 'i', 'o', 'u'));
    }

}