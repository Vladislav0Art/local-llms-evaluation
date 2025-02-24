package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsKnownTagStaticTest {

    @Test
    public void isKnownTagStaticTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

}