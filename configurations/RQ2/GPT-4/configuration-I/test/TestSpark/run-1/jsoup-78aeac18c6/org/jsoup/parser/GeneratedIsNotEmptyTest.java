package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertFalse(characterReader.isEmpty());
    }

}