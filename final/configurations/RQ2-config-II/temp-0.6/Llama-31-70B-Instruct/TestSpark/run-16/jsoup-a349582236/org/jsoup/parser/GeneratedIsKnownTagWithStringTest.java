package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsKnownTagWithStringTest {

    @Test
    public void isKnownTagWithStringTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

}