package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedDoesNotMatchTest {

    @Test
    public void doesNotMatchTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertFalse(characterReader.matches('a'));
    }

}