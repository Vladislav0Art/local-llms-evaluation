package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = new Tag("div");
        ParseSettings settings = new ParseSettings(true, true);
        assertEquals(tag, Tag.valueOf("div", settings));
    }

}