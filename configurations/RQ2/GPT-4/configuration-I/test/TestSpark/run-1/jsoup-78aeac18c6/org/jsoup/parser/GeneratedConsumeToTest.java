package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedConsumeToTest {

    @Test
    public void consumeToTest() {
        CharacterReader characterReader = new CharacterReader("testInput");
        Assert.assertEquals("test", characterReader.consumeTo('I'));
    }

}