package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertEquals("test", characterReader.toString());
    }

}