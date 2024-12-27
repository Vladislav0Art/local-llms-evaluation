package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedPosTest {

    @Test
    public void posTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertEquals(0, characterReader.pos());
    }

}