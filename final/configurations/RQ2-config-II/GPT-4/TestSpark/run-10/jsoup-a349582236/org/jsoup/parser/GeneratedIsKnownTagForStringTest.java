package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsKnownTagForStringTest {

    @Test
    public void isKnownTagForStringTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

}