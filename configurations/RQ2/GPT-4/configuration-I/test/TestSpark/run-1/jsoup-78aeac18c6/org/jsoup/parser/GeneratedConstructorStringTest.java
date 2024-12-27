package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedConstructorStringTest {

    @Test
    public void constructorStringTest() {
        CharacterReader characterReader = new CharacterReader("testInput");
        Assert.assertNotNull(characterReader);
    }

}