package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedConsumeToAnyTest {

    @Test
    public void consumeToAnyTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertEquals("te", characterReader.consumeToAny('s', 't'));
    }

}