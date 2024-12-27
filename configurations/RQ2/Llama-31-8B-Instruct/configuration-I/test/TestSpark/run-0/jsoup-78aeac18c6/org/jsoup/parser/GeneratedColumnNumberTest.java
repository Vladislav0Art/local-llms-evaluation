package org.jsoup.parser;

import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedColumnNumberTest {

    @Test
    public void columnNumberTest() {
        CharacterReader reader = new CharacterReader(new StringReader("Hello, World!"));
        assertEquals(1, reader.columnNumber());
    }

}