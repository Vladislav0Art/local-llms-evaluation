package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        assertTrue(Tag.valueOf("input").isFormListed());
        assertFalse(Tag.valueOf("p").isFormListed());
    }

}