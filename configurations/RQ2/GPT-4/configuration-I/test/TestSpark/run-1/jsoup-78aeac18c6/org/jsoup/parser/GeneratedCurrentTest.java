package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedCurrentTest {

    @Test
    public void currentTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertEquals('t', characterReader.current());
    }

}