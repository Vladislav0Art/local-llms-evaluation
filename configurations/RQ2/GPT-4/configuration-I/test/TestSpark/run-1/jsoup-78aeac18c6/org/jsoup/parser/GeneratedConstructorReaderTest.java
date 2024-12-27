package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedConstructorReaderTest {

    @Test
    public void constructorReaderTest() {
        CharacterReader characterReader = new CharacterReader(new StringReader("testInput"));
        Assert.assertNotNull(characterReader);
    }

}