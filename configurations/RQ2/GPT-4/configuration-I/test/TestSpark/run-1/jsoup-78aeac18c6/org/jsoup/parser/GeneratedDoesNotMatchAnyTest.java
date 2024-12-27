package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedDoesNotMatchAnyTest {

    @Test
    public void doesNotMatchAnyTest() {
        CharacterReader characterReader = new CharacterReader("test");
        Assert.assertFalse(characterReader.matchesAny('a', 'b', 'c'));
    }

}