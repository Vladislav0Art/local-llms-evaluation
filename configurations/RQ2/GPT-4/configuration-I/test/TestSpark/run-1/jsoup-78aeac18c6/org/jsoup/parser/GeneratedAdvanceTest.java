package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedAdvanceTest {

    @Test
    public void advanceTest() {
        CharacterReader characterReader = new CharacterReader("test");
        characterReader.advance();
        Assert.assertEquals('e', characterReader.current());
    }

}