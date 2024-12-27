package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedConsumeTest {

    @Test
    public void consumeTest() {
        CharacterReader characterReader = new CharacterReader("test");
        characterReader.consume();
        Assert.assertEquals('e', characterReader.current());
    }

}