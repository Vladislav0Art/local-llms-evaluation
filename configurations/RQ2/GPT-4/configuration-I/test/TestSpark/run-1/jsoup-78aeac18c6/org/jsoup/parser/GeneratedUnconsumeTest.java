package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedUnconsumeTest {

    @Test
    public void unconsumeTest() {
        CharacterReader characterReader = new CharacterReader("test");
        characterReader.consume();
        characterReader.unconsume();
        Assert.assertEquals('t', characterReader.current());
    }

}